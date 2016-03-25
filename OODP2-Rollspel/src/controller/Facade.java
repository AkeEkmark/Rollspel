package controller;

import model.Factory.HeroFactory;
import model.characterModel.Hero;
import model.entitiesModel.HealingPotion;
import model.modelUtilities.ModelFacade;

public class Facade {
	public static ModelFacade modelFacade;
	
	public Facade(ModelFacade modelFacade) {
		this.modelFacade = modelFacade;
	}
	public static ModelFacade getModel() {
		return modelFacade;
	}
	public void DrinkHealingPotion(HealingPotion potion){
		modelFacade.addHitpointsToCharacter(potion.drinkPotion());
	}
	public void createChar(String charName, String selectedClass) {
		System.out.println("Create char with name : "+charName +" and class : "+selectedClass);
		Hero hero = HeroFactory.getHero(charName, selectedClass);
		modelFacade.setCharacter(hero);
		
	}
}
