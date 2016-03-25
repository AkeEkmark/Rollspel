package model.entitiesModel;

public class SpikeTrap extends Trap {

	public SpikeTrap(){
		super.damage = 10;
		super.difficulty = 25;
		super.hasTriggered = false;
		super.description = "A number of spikes shoot out from the floor";
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
		hasTriggered = true;
		
	}
	@Override
	public String getDescription() {
		return description;
	}
	@Override
	public String getHitDesc() {
		return "With no chance to react to the spikes they penetrate your body dealing " +getdamage() +" damage";
	}
	@Override
	public String getMissDesc() {
		return "You barely manage to dodge away from the spikes";
	}

}
