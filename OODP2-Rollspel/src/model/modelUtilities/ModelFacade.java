package model.modelUtilities;

import java.util.Observer;

import model.characterModel.CharacterIsDeadException;
import model.entitiesModel.Loot;
import model.entitiesModel.Monster;
import model.entitiesModel.MonsterIsDeadException;
import model.entitiesModel.Trap;
import model.roomModel.Location;
import model.characterModel.Hero;


public interface ModelFacade  {

	public void moveCharacter(Location nextRoom);
	public void loot(Loot loot);
	public void removeHitpointsFromCharacter(int hitPoints) throws CharacterIsDeadException;
	public void removeHitpointsFromMonster(int hitPoints, Monster monster) throws MonsterIsDeadException;
	public void addHitpointsToCharacter(int hitPoints);
	public Hero getCharacter();
	public Location getLocation();
	public void addObserver(Observer o);
	public Monster getMonster();
	public boolean monsterIsAlive();
	public void monsterIsSlain();
	public Trap getTrap();
	public boolean trapHasTriggered();
	
	
}
