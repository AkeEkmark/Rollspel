package model.characterModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import model.entitiesModel.Armour;
import model.entitiesModel.Loot;
import model.entitiesModel.Potion;
import model.entitiesModel.Weapon;

public class Inventory extends Observable {
	
	private Weapon weapon;
	private Armour armour;
	private List<Potion> Potions;
	public Inventory(){
		this.Potions = new ArrayList<Potion>();
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public Armour getArmour() {
		return armour;
	}
	public List<Potion> getPotions() {
		return Potions;
	}
	public void setWeapon(Loot weapon) {
		this.weapon = (Weapon) weapon;
		setChanged();
		notifyObservers();
	}
	public void setArmour(Loot armour) {
		this.armour = (Armour) armour;
		setChanged();
		notifyObservers();
	}
	public void addPotion(Loot potion) {
		Potions.add((Potion)potion);
		setChanged();
		notifyObservers();
	}
}
