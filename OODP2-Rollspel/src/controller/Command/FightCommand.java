package controller.Command;

import model.entitiesModel.Monster;
import model.entitiesModel.MonsterIsDeadException;
import model.modelUtilities.Die;
import model.modelUtilities.FightTable;
import model.modelUtilities.NormalFightTable;
import controller.GameOutput;
import model.characterModel.Hero;
import model.characterModel.CharacterIsDeadException;

public class FightCommand implements CommandInterface {
	private Die d20 = new Die(20);
	private Hero hero;
	private Monster villain;
	private FightTable ft = new NormalFightTable();

	public FightCommand(Monster monster, Hero character){
		this.villain = monster;
		this.hero = character;
		
	}
	@Override
	public void execute() throws MonsterIsDeadException, CharacterIsDeadException {
		GameOutput.addGameText("the round begins", false);
		if(agilityCheck() > 0){
		characterStrike();
		monsterStrike();
		} else{
			monsterStrike();
			characterStrike(); 
		}
		GameOutput.addGameText("The round is over. You have " + hero.getHitpoints() + " and the kobold has " + villain.getHitpoints() + " hitpoints left", false);
		

	}
	private int agilityCheck() {
		int heroTmp = 0;
		int villainTmp = 0;
		heroTmp = d20.roll()+hero.getAgility();
		villainTmp = d20.roll()+villain.getAgility();
		return heroTmp - villainTmp;
	}
	private void monsterStrike() throws CharacterIsDeadException {
		int heroTmp = 0;
		int villainTmp = 0;
		int gap = 0;
		int weaponModifier = hero.getInventory().getWeapon().getModifier();
		int armourModifier = hero.getInventory().getArmour().getModifier();
		heroTmp = d20.roll()+hero.getStrength()+weaponModifier;
		villainTmp = d20.roll()+villain.getStrength();
		gap = villainTmp - heroTmp;
		int dmgTmp = ft.hitPointsFromGap(gap) - armourModifier;
		if(gap>0){
			if(ft.hitPointsFromGap(gap) < armourModifier){
				GameOutput.addGameText("The kobold strikes but your armour absorbs the blow completely", false);
			} else{
				GameOutput.addGameText("You where hit by the nasty kobold! His nasty strike wounds for "+dmgTmp + " hitpoints and your armour absorbs "+ armourModifier, false);
				hero.removeHitpoints(dmgTmp);
		}
		} else{
			GameOutput.addGameText("the kobold misses your body and hisses in anger", false);
		}
	}
	private void characterStrike() throws MonsterIsDeadException {
		int heroTmp = 0;
		int villainTmp = 0;
		int gap = 0;
		int weaponModifier = hero.getInventory().getWeapon().getModifier();
		heroTmp = d20.roll()+hero.getStrength()+weaponModifier;
		villainTmp = d20.roll()+villain.getStrength();
		gap = heroTmp - villainTmp;
		if(gap>0){
			GameOutput.addGameText("You strike the kobold so hard his candle flies through the air and he loses "+ ft.hitPointsFromGap(gap) + " hitpoints", false);
		}else{
			GameOutput.addGameText("You strike far above the kobolds head, unused to fight such short beeings", false);
		}
		villain.removeHitpoints(ft.hitPointsFromGap(gap));
	}

}
