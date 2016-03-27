package model.roomModel;

import java.util.List;

import model.entitiesModel.Loot;
import model.entitiesModel.Monster;
import model.entitiesModel.Quest;
import model.entitiesModel.Trap;

public class LootLocation extends LocationDecorator implements LocationInterface {
	private Loot loot;

	public LootLocation(Location location, Loot loot) {
		super(location);
		this.loot = loot;
		addAction(Action.loot);
	}

	public Loot getLoot() {
		return loot;
	}

	public Location getNorthExit() {
		return location.getNorthExit();
	}
	
	public void setNorthExit(Location northExit) {
		location.setNorthExit(northExit);
	}
	
	public Location getEastExit() {
		return location.getEastExit();
	}
	
	public void setEastExit(Location eastExit) {
		location.setEastExit(eastExit);
	}
	
	public Location getSouthExit() {
		return location.getEastExit();
	}
	
	public void setSouthExit(Location southExit) {
		location.setSouthExit(southExit);
	}
	
	public Location getWestExit() {
		return location.getWestExit();
	}
	
	public void setWestExit(Location westExit) {
		location.setWestExit(westExit);
	}
	
	public String getDescription() {
		return location.getDescription();
	}
	
	public List<Action> getAvailableActions() {
		return location.getAvailableActions();
	}
	
	public void addAction(Action action) {
		location.addAction(action);
	}
	
	@Override
	public Monster getMonster() {
		return location.getMonster();
	}

	@Override
	public Trap getTrap() {
		return location.getTrap();
	}

	@Override
	public Quest getQuest() {
		return location.getQuest();
	}

}

