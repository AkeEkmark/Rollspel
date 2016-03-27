package controller;

import model.Factory.HeroFactory;
import model.characterModel.Hero;
import model.entitiesModel.HealingPotion;
import model.modelUtilities.ModelFacade;

public class Facade {
	private static ModelFacade modelFacade;
	
	public Facade(ModelFacade modelFacade) {
		Facade.modelFacade = modelFacade;
	}
	public static ModelFacade getModel() {
		return modelFacade;
	}
	public void DrinkHealingPotion(HealingPotion potion){
		modelFacade.addHitpointsToCharacter(potion.drinkPotion());
	}
	public void createChar(String charName, String selectedClass) {
		Hero hero = HeroFactory.getHero(charName, selectedClass);
		modelFacade.setCharacter(hero);
	}
}
