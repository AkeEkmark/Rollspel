package model.Factory;



import model.characterModel.Hero;
import model.characterModel.Mysticist;
import model.characterModel.Rogue;
import model.characterModel.Warrior;

public class HeroFactory {
	private static HeroFactory heroFactory;
	
	
	private HeroFactory() {
		heroFactory = this;
		
	}

	
	public static Hero getHero(String charName, String selectedClass) {
		if (heroFactory == null){
			new HeroFactory();
		}
		if (selectedClass.contains("warrior")){
			return new Warrior(charName);
		}
		if (selectedClass.contains("rogue")) {
			return new Rogue(charName);
		}
		if (selectedClass.contains("mysticist")) {
			return new Mysticist(charName);
		}
		
		return null;
	}
}
