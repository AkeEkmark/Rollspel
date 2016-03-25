package model.roomModel;

import java.util.ArrayList;
import java.util.List;

import model.entitiesModel.Loot;
import model.entitiesModel.Monster;
import model.entitiesModel.Quest;
import model.entitiesModel.Trap;

public abstract class Location implements LocationInterface {
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
	
	public List<Action> getAvailableActions() {
		return availableActions;
	}

	public void addAction(Action action) {
		availableActions.add(action);
	}
	
	public String toString() {
		return "<Location>";
	}
	public Monster getMonster(){
		return null;
		
	}
	public Trap getTrap(){
		return null;
		
	}
	public Loot getLoot(){
		return null;
		
	}
	public Quest getQuest() {
		return null;
	}
}
