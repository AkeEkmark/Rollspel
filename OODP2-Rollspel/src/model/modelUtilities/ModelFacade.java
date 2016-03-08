package model.modelUtilities;

import model.entitiesModel.Loot;

public interface ModelFacade {

	public void moveCharacter();
	public void loot(Loot loot);
	public void removeHitpointsFromCharacter(int hitPoints);
	public void removeHitpointsFromMonster(int hitPoints);
	public void addHitpointsToCharacter(int hitPoints);
	
	
}
