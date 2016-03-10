package model.modelUtilities;

import model.characterModel.CharacterIsDeadException;
import model.entitiesModel.Loot;
import model.entitiesModel.Monster;
import model.entitiesModel.MonsterIsDeadException;
import model.roomModel.Location;
import model.characterModel.Character;

public class DungeonModelFacade implements ModelFacade {
	private DungeonInstance di;
	
	public DungeonModelFacade(DungeonInstance di){
		this.di = di;
	}
	@Override
	public void moveCharacter() {

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
	public Character getCharacter() {
		return di.getCharacter();
	}

	@Override
	public Location getLocation() {
		return di.getCurrentLocation();
	}

}
