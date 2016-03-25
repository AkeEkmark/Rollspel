package model.modelUtilities;

import java.util.List;
import model.characterModel.Hero;
import model.entitiesModel.Monster;
import model.entitiesModel.Quest;
import model.entitiesModel.Trap;
import model.roomModel.Location;
import model.roomModel.MonsterLocation;
import model.roomModel.TrapLocation;

public class DungeonInstance implements LocationInstance {
	private List<Location> dungeonMap;

	private Hero character;
	private int index = 0;
	private Monster monster = null;
	
	public DungeonInstance(List<Location> dungeonMap){
		this.dungeonMap = dungeonMap;
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
	
	@Override
	public void setCharacter(Hero character) {
		this.character = character;
	}
	

	public Hero getCharacter() {
		return character;
	}

	public Monster getMonster() {
		return getCurrentLocation().getMonster();
	}

	public void removeFightAction() {
		
		
	}

	public Trap getTrap() {
		return getCurrentLocation().getTrap();
	}

	public Quest getQuest() {
		return getCurrentLocation().getQuest();
	}

}
