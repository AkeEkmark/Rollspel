package model.entitiesModel;

public class SpikeTrap extends Trap {

	public SpikeTrap(){
		super.damage = 10;
		super.difficulty = 25;
		super.hasTriggered = false;
	}
	@Override
	public int getDifficulty() {
		return difficulty;
	}

	@Override
	public int getdamage() {
		return damage;
	}
	@Override
	public boolean hasTriggered() {
		return hasTriggered;
	}
	@Override
	public void setTriggered() {
		hasTriggered = !hasTriggered;
		
	}

}
