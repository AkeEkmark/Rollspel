package model.entitiesModel;

public class Kobold extends Monster {
	
	public Kobold(String description){
		super(description);
		super.strength = 15;
		super.Agility = 14;
		super.intelligence = 3;
		super.hitpoints = 15;
		super.name = "Kobold";
		
	}
}

