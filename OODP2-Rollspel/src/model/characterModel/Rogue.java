package model.characterModel;

public class Rogue extends Hero{
	public Rogue(String name) {
		super(name);
		super.strength = 10;
		super.Agility = 15;
		super.intelligence = 10;
		super.hitpoints = 30;
		super.maxHitpoints = 30;
		super.inventory = new Inventory();
	}
}
