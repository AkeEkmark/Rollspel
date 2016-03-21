package model.modelUtilities;

import java.util.List;
import model.characterModel.Hero;
import model.entitiesModel.Monster;
import model.entitiesModel.Trap;
import model.roomModel.Location;
import model.roomModel.MonsterLocation;

public class DungeonInstance implements LocationInstance {
	private List<Location> dungeonMap;

	private Hero character;
	private int index = 0;
	private Monster monster = null;
	
	public DungeonInstance(List<Location> dungeonMap, Hero character){
		this.dungeonMap = dungeonMap;
		this.character = character;
		
	}
	
	@Override
	public void moveCharacter(Location nextRoom) {
		for(int i = 0; i< dungeonMap.size(); i++){
			if (dungeonMap.get(i).equals(nextRoom)){
				index = i; 
				System.out.println("character moved to :"+index);
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

	public Monster getMonster() {
		MonsterLocation location = (MonsterLocation) getCurrentLocation();
		return location.getMonster();
	}

	public void removeFightAction() {
		
		
	}

	public Trap getTrap() {
		TrapLocation location = (TrapLocation) getCurrentLocation();
		return location.getTrap();
	}
}
