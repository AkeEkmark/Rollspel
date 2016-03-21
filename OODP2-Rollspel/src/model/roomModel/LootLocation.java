package model.roomModel;

import model.entitiesModel.Loot;

public class LootLocation extends LocationDecorator {
	private Loot loot;
	
	public LootLocation(Location location, Loot loot){
		super(location);
		this.loot = loot;
		addAction(Action.loot);
		
		
	}
	public Loot getLoot(){
		return loot;
	}
}
