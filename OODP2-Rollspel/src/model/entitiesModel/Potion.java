package model.entitiesModel;

public abstract class Potion implements Loot {
	
	protected String name;
	protected boolean hasBeenLooted;
	@Override
	public abstract boolean hasBeenLooted();

	@Override
	public abstract void setLooted();

	@Override
	public abstract String getName();
	
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
