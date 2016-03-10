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
		return Agility;
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
	}
	public void addHitpoints(int hpToAdd){
		hitpoints += hpToAdd;
		if (hitpoints > maxHitpoints){
			hitpoints = maxHitpoints;
		}
	}
}
