package model.characterModel;

import java.util.List;
import java.util.Observable;

import model.entitiesModel.Armour;
import model.entitiesModel.Potion;
import model.entitiesModel.Weapon;

public class Inventory extends Observable{
	
	private Weapon weapon;
	private Armour armour;
	private List<Potion> Potions;
	public Weapon getWeapon() {
		return weapon;
	}
	public Armour getArmour() {
		return armour;
	}
	public List<Potion> getPotions() {
		return Potions;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public void setArmour(Armour armour) {
		this.armour = armour;
	}
	public void addPotion(Potion potion) {
		Potions.add(potion);
	}
}
