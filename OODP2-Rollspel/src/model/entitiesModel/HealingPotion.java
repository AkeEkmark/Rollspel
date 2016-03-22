package model.entitiesModel;

public class HealingPotion extends Potion {
	private int hitpointsToHeal;
	public HealingPotion(int healingPower){
		this.hitpointsToHeal=healingPower;
		super.hasBeenLooted = false;
		super.name = "Healing Potion";
	}
	public int drinkPotion(){
		return hitpointsToHeal;
	}
	@Override
	public boolean hasBeenLooted() {
		return hasBeenLooted;
	}
	@Override
	public void setLooted() {
		hasBeenLooted = true;
		
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public boolean isWeapon() {
		return false;
	}
	@Override
	public boolean isArmour() {
		return false;
	}
	@Override
	public boolean isPotion() {
		return true;
	}
}
