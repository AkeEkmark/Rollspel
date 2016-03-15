package model.roomModel;

import model.entitiesModel.Monster;

public class MonsterLocation extends LocationDecorator {
	private Monster monster;
	
	public MonsterLocation(Location location, Monster monster) {
		super(location);
		this.monster = monster;
		addAction(Action.Fight);
		
	}
	public Monster getMonster() {
		return monster;
	}

}
