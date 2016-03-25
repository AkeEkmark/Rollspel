package model.entitiesModel;

public class ChainMail extends Armour implements Loot {

	public ChainMail() {
		super.modifier = 3;
		super.name = "Chainmail";
		super.lootDescription = "You find a rusty chainmail and replace your current armor with it";
	}
}
