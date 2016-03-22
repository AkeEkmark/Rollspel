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
	public Loot getLoot() {
		return location.getLoot();
	}

	@Override
	public Trap getTrap() {
		return location.getTrap();
	}

}
