package model.roomModel;

import java.util.List;

import model.entitiesModel.Loot;
import model.entitiesModel.Monster;
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
		return location.northExit;
	}

	public void setNorthExit(Location northExit) {
		location.northExit = northExit;
		location.addAction(Action.goNorth);
	}

	public Location getEastExit() {
		return location.eastExit;
	}

	public void setEastExit(Location eastExit) {
		location.eastExit = eastExit;
		location.addAction(Action.goEast);
	}

	public Location getSouthExit() {
		return location.southExit;
	}

	public void setSouthExit(Location southExit) {
		location.southExit = southExit;
		location.addAction(Action.goSouth);
	}

	public Location getWestExit() {
		return location.westExit;
	}

	public void setWestExit(Location westExit) {
		location.westExit = westExit;
		location.addAction(Action.goWest);
	}

	public String getDescription() {
		return location.description;
	}

	public List<Action> getAvailableActions() {
		return location.availableActions;
	}

	public void addAction(Action action) {
		location.availableActions.add(action);
	}

	@Override
	public Monster getMonster() {
		return location.getMonster();
	}

	@Override
	public Trap getTrap() {
		return location.getTrap();
	}

}

