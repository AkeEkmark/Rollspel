package model.entitiesModel;

public abstract class Potion implements Loot{
	protected String name;
	protected boolean hasBeenLooted;
	@Override
	public abstract boolean hasBeenLooted();

	@Override
	public abstract void setLooted();

	@Override
	public abstract String getName();

}
