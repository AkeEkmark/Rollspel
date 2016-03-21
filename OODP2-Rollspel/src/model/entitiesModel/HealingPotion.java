package model.entitiesModel;

public class HealingPotion extends Potion {
	private int hitpointsToHeal;
	public HealingPotion(int healingPower){
		this.hitpointsToHeal=healingPower;
	}
	public int drinkPotion(){
		return hitpointsToHeal;
	}
}
