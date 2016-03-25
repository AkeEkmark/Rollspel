package model.entitiesModel;

public class Armour implements Loot {
	protected int modifier;
	protected String name;
	protected boolean hasBeenLooted = false;
	protected String lootDescription;
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
	@Override
	public boolean isWeapon() {
		return false;
	}
	@Override
	public boolean isArmour() {
		return true;
	}
	@Override
	public boolean isPotion() {
		return false;
	}
	@Override
	public String lootDesc() {
		return lootDescription;
	}
}
