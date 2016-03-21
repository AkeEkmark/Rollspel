package model.entitiesModel;

public abstract class Trap {
	protected int difficulty;
	protected int damage;
	protected boolean hasTriggered;
	public abstract int getDifficulty();
	public abstract int getdamage();
	public abstract boolean hasTriggered();
	public abstract void setTriggered();
	
	

}
