package model.characterModel;

import java.util.Observable;

public abstract class Hero extends Observable {

	protected String name;
	protected int strength;
	protected int hitpoints;
	protected boolean sixthSense = false;
	protected int intelligence;
	protected int agility;
	protected int maxHitpoints;
	protected Inventory inventory;

	public Hero(String name){
		this.name = name;
		this.inventory =  new Inventory();
		
	}
	public String getName() {
		return name;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public int getHitpoints() {
		return hitpoints;
	}
	
	public int getIntelligence() {
		return intelligence;
	}
	
	public int getAgility() {
		return agility;
	}
	
	public int getMaxHitpoints() {
		return maxHitpoints;
	}
	
	public Inventory getInventory() {
		return inventory;
	}
	public void removeHitpoints(int hpToRemove) throws CharacterIsDeadException{
		hitpoints -= hpToRemove;
		if (hitpoints <= 0){
			throw new CharacterIsDeadException();
		}
		setChanged();
	    notifyObservers();
	}
	public void addHitpoints(int hpToAdd){
		hitpoints += hpToAdd;
		if (hitpoints > maxHitpoints){
			hitpoints = maxHitpoints;
		}
		setChanged();
	    notifyObservers();
	}
}
