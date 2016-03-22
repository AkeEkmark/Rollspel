package model.roomModel;

import java.util.List;

import model.entitiesModel.Loot;
import model.entitiesModel.Monster;
import model.entitiesModel.Trap;

public class TrapLocation extends LocationDecorator implements LocationInterface {
	private Trap trap;

	public TrapLocation(Location location, Trap trap) {
		super(location);
		this.trap = trap;
		location.addAction(Action.Trap);
	}

	public Trap getTrap() {
		return trap;
	}

	public Location getNorthExit() {
		return location.getNorthExit();
	}

	public void setNorthExit(Location northExit) {
		location.setNorthExit(northExit);
		location.addAction(Action.goNorth);
	}

	public Location getEastExit() {
		return location.getEastExit();
	}

	public void setEastExit(Location eastExit) {
		location.setEastExit(eastExit);
		location.addAction(Action.goEast);
	}

	public Location getSouthExit() {
		return location.getEastExit();
	}

	public void setSouthExit(Location southExit) {
		location.setSouthExit(southExit);
		location.addAction(Action.goSouth);
	}

	public Location getWestExit() {
		return location.getWestExit();
	}

	public void setWestExit(Location westExit) {
		location.setWestExit(westExit);
		location.addAction(Action.goWest);
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
	public Loot getLoot() {
		return location.getLoot();
	}

}
