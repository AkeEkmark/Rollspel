package model.roomModel;

import java.util.List;

import model.entitiesModel.Loot;
import model.entitiesModel.Monster;
import model.entitiesModel.Trap;

public class MonsterLocation extends LocationDecorator implements LocationInterface {
	private Monster monster;

	public MonsterLocation(Location location, Monster monster) {
		super(location);
		this.monster = monster;
		addAction(Action.Fight);

	}

	public Monster getMonster() {
		return monster;
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
	public Loot getLoot() {
		return location.getLoot();
	}

	@Override
	public Trap getTrap() {
		return location.getTrap();
	}

}
