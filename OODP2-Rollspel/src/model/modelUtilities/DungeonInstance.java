package model.modelUtilities;

import java.util.List;
import model.characterModel.Hero;
import model.roomModel.Location;

public class DungeonInstance implements LocationInstance {
	private List<Location> dungeonMap;

	private Hero character;
	private int index = 0;
	
	public DungeonInstance(List<Location> dungeonMap, Hero character){
		this.dungeonMap = dungeonMap;
		this.character = character;
		
	}
	
	@Override
	public void moveCharacter(Location nextRoom) {
		for(int i = 0; i< dungeonMap.size(); i++){
			if (dungeonMap.get(i).equals(nextRoom)){
				index = i; 
			}
		}
	}

	@Override
	public Location getCurrentLocation() {	
		return dungeonMap.get(index);
	}

	public Hero getCharacter() {
		return character;
	}
}
