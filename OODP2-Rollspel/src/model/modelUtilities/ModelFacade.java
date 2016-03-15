package model.modelUtilities;

import model.characterModel.CharacterIsDeadException;
import model.entitiesModel.Loot;
import model.entitiesModel.Monster;
import model.entitiesModel.MonsterIsDeadException;
import model.roomModel.Location;
import model.characterModel.Hero;

public interface ModelFacade {

	public void moveCharacter();
	public void loot(Loot loot);
	public void removeHitpointsFromCharacter(int hitPoints) throws CharacterIsDeadException;
	public void removeHitpointsFromMonster(int hitPoints, Monster monster) throws MonsterIsDeadException;
	public void addHitpointsToCharacter(int hitPoints);
	public Hero getCharacter();
	public Location getLocation();
	
	
}
