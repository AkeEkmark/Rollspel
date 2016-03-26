package controller;

import model.entitiesModel.Loot;
import model.entitiesModel.Monster;
import model.entitiesModel.Quest;
import model.entitiesModel.Trap;
import model.roomModel.DungeonLocation;
import model.roomModel.Location;
import model.roomModel.LootLocation;
import model.roomModel.MonsterLocation;
import model.roomModel.QuestLocation;
import model.roomModel.TrapLocation;

public class DungeonLocationBuilder extends LocationBuilder {
	private Location location;

	@Override
	public Location buildLocation(String description, Monster monster, Loot loot, Trap trap, Quest quest) {
		this.location = new DungeonLocation(description);
		if (monster != null)
			addMonster(monster);
		if (loot != null)
			addLoot(loot);
		if (trap != null)
			addTrap(trap);
		if (quest != null)
			addQuest(quest);
		return location;

	}

	@Override
	public void addMonster(Monster monster) {
		location = new MonsterLocation(location, monster);

	}

	@Override
	public void addLoot(Loot loot) {
		location = new LootLocation(location, loot);

	}

	@Override
	public void addTrap(Trap trap) {
		location = new TrapLocation(location, trap);

	}

	@Override
	public void addQuest(Quest quest) {
		location = new QuestLocation(location, quest);
	}

}
