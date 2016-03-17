package model.modelUtilities;

import java.util.Observable;
import java.util.Observer;

import model.characterModel.CharacterIsDeadException;
import model.entitiesModel.Loot;
import model.entitiesModel.Monster;
import model.entitiesModel.MonsterIsDeadException;
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
		setChanged();
		notifyObservers();

	}

	@Override
	public void loot(Loot loot) {

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

	public void addObserver(Observer o) {

		
	}
	@Override
	public Monster getMonster() {
		
		return di.getMonster();
	}

}
