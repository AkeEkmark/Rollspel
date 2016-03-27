package model.entitiesModel;

public class Skeleton extends Monster {
	
	public Skeleton(String description){
		super(description);
		super.strength = 11;
		super.Agility = 10;
		super.intelligence = 3;
		super.hitpoints = 10;
		super.name = "Skeleton";
	}
}

