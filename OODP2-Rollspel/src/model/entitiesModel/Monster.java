package model.entitiesModel;

public abstract class Monster {

	protected int strength;
	protected int hitpoints;
	protected int intelligence;
	protected int Agility;
	protected String description;
	protected String name;
	
	public Monster(String description){
		this.description = description;
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
	
	public String getDescription() {
		return description;
	}
	public void removeHitpoints(int hpToRemove) throws MonsterIsDeadException{
		hitpoints -= hpToRemove;
		if (hitpoints <= 0){
			throw new MonsterIsDeadException();
		}
	}
	public String getName() {
		return name;
	}
}
