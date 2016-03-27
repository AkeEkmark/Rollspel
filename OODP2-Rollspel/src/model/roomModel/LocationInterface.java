package model.roomModel;

import java.util.List;

import model.entitiesModel.Loot;
import model.entitiesModel.Monster;
import model.entitiesModel.Quest;
import model.entitiesModel.Trap;

public interface LocationInterface {

	public Location getNorthExit();

	public void setNorthExit(Location northExit);

	public Location getEastExit();

	public void setEastExit(Location eastExit);

	public Location getSouthExit();

	public void setSouthExit(Location southExit);

	public Location getWestExit();

	public void setWestExit(Location westExit);

	public String getDescription();
	
	public List<Action> getAvailableActions();

	public void addAction(Action action);
	
	public String toString();
	
	public Monster getMonster();
	
	public Loot getLoot();
	
	public Trap getTrap();
	
	public Quest getQuest();
	
}

