package controller;

import model.entitiesModel.Loot;
import model.entitiesModel.Monster;
import model.entitiesModel.Trap;
import model.roomModel.Location;

public abstract class LocationBuilder {
	public abstract Location buildLocation(String description, Monster monster, Loot loot, Trap trap);

	public abstract void addMonster(Monster monster);

	public abstract void addLoot(Loot loot);
	
	public abstract void addTrap(Trap trap);

}
