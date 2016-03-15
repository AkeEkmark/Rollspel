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
}
