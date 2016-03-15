package model.roomModel;

import java.util.ArrayList;
import java.util.List;

public abstract class Location {
	protected String description;
	protected Location northExit;
	protected Location eastExit;
	protected Location southExit;
	protected Location westExit;
	protected List<Action> availableActions = new ArrayList<Action>();
	
	public Location() {
		
	}
	
	public Location(String description) {
		this.description = description;
		
	}

	public Location getNorthExit() {
		return northExit;
	}

	public void setNorthExit(Location northExit) {
		this.northExit = northExit;
		addAction(Action.goNorth);
	}

	public Location getEastExit() {
		return eastExit;
	}

	public void setEastExit(Location eastExit) {
		this.eastExit = eastExit;
		addAction(Action.goEast);
	}

	public Location getSouthExit() {
		return southExit;
	}

	public void setSouthExit(Location southExit) {
		this.southExit = southExit;
		addAction(Action.goSouth);
	}

	public Location getWestExit() {
		return westExit;
	}

	public void setWestExit(Location westExit) {
		this.westExit = westExit;
		addAction(Action.goWest);
	}

	public String getDescription() {
		return description;
	}
	
	protected void addAction(Action action) {
		availableActions.add(action);
	}
	
	
}
