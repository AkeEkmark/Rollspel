package model.characterModel;

public abstract class Character {
	protected String name;
	protected int strength;
	protected int hitpoints;
	protected int intelligence;
	protected int Agility;
	protected int maxHitpoints;
	protected Inventory inventory;

	public Character(String name){
		this.name = name;
	}
}
