package controller;

import model.entitiesModel.Loot;
import model.entitiesModel.Monster;
import model.roomModel.DungeonLocation;
import model.roomModel.Location;
import model.roomModel.MonsterLocation;

public class DungeonLocationBuilder extends LocationBuilder {
	private Monster monster;
	private Loot loot;
	private String description;
	private Location location;
	

	@Override
	public Location buildLocation(String description, Monster monster, Loot loot) {
		this.monster = monster;
		this.loot = loot;
		this.description = description;
		this.location = new DungeonLocation(description);
		if(monster != null)
			addMonster(monster);
		if(loot != null)
			addLoot(loot);
		return location;

	}

	@Override
	public void addMonster(Monster monster) {
	location = new MonsterLocation(location, monster);

	}

	@Override
	public void addLoot(Loot loot) {
	

	}

}
