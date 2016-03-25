package model.entitiesModel;

public class DeathTrap extends Trap {

	
	public DeathTrap(){
	super.damage = 500;
	super.difficulty = 500;
	super.hasTriggered = false;
	super.description = "You are surrounded by silence and darkness.";
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
		return "Time and space is warped around you and as a result you are "
			+ "forever doomed to wander this corridor endlessly without purpose or meaning.";
	}

	@Override
	public String getMissDesc() {
		return "No chance";
	}

}
