package model.entitiesModel;

public abstract class Monster {
	protected int strength;
	protected int hitpoints;
	protected int intelligence;
	protected int Agility;
	protected String description;
	
	public Monster(String description){
		this.description = description;
	}
}
