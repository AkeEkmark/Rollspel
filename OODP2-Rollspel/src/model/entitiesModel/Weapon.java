package model.entitiesModel;

public class Weapon implements Loot {
	protected String name;
	protected int modifier;
	protected boolean hasBeenLooted = false;
	public String getName() {
		return name;
	}
	public int getModifier(){
		return modifier;
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
