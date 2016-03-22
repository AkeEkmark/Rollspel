package model.entitiesModel;

public class Armour implements Loot {
	protected int modifier;
	protected String name;
	protected boolean hasBeenLooted = false;
	public int getModifier(){
		return modifier;
	}
	public String getName() {
		return name;
	}
	@Override
	public boolean hasBeenLooted() {
		return hasBeenLooted;
	}
	@Override
	public void setLooted() {
		hasBeenLooted = true;
		
	}
}
