package model.characterModel;

public class Rogue extends Hero{
	public Rogue(String name) {
		super(name);
		super.strength = 10;
		super.agility = 15;
		super.sixthSense = false;
		super.intelligence = 10;
		super.hitpoints = 30;
		super.maxHitpoints = 30;
		super.characterClass = "Rogue";
	
	}
}
