package model.modelUtilities;

import java.util.Observable;

import model.characterModel.CharacterIsDeadException;
import model.entitiesModel.Armour;
import model.entitiesModel.Loot;
import model.entitiesModel.Monster;
import model.entitiesModel.MonsterIsDeadException;
import model.entitiesModel.Potion;
import model.entitiesModel.Trap;
import model.entitiesModel.Weapon;
import model.roomModel.Location;
import model.characterModel.Hero;

public class DungeonModelFacade extends Observable implements ModelFacade {
	private DungeonInstance di;
	
	public DungeonModelFacade(DungeonInstance di){
		this.di = di;
	}
	@Override
	public void moveCharacter(Location nextRoom) {
		di.moveCharacter(nextRoom);
		System.out.println(getLocation().getDescription());
		setChanged();
		notifyObservers();

	}

	@Override
	public void addHitpointsToCharacter(int hitPoints) {
		di.getCharacter().addHitpoints(hitPoints);
	}

	@Override
	public void removeHitpointsFromCharacter(int hitPoints) throws CharacterIsDeadException {
		di.getCharacter().removeHitpoints(hitPoints);
	}

	@Override
	public void removeHitpointsFromMonster(int hitPoints, Monster monster) throws MonsterIsDeadException {
		monster.removeHitpoints(hitPoints);
	}

	@Override
	public Hero getCharacter() {
		return di.getCharacter();
	}

	@Override
	public Location getLocation() {
		return di.getCurrentLocation();
	}

	@Override
	public Monster getMonster() {
		return di.getMonster();
	}
	@Override
	public boolean monsterIsAlive() {
		if(getMonster().getHitpoints() > 0) {
			return true;
		}
		return false;
	}
	@Override
	public void monsterIsSlain() {
		di.removeFightAction();
	}
	@Override
	public Trap getTrap() {
		return di.getTrap();
	}
	public boolean trapHasTriggered(){
		return getTrap().hasTriggered();
	}

	@Override
	public void loot(Loot loot) {
		if (loot.isWeapon()) {
			getCharacter().getInventory().setWeapon(loot);
		} else if (loot.isArmour()) {
			getCharacter().getInventory().setArmour(loot);
		} else {
			getCharacter().getInventory().addPotion(loot);
		}
	}

}
