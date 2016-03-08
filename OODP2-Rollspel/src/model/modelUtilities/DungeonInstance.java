package model.modelUtilities;

import java.util.List;

import model.roomModel.Location;

public class DungeonInstance implements LocationInstance {
	private List<Location> dungeonMap;
	private Character character;
	
	public DungeonInstance(List<Location> dungeonMap, Character character){
		this.dungeonMap = dungeonMap;
		this.character = character;
		
	}
	
	@Override
	public void moveCharacter() {

	}

	@Override
	public Location currentLocation() {
		return null;
	}

}
