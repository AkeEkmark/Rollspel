package model.entitiesModel;

public class Weapon implements Loot {
	protected String name;
	protected int modifier;
	public String getName() {
		return name;
	}
	public int getModifier(){
		return modifier;
	}
	
}
