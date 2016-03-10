package controller.Command;

import model.entitiesModel.Monster;
import model.entitiesModel.MonsterIsDeadException;
import model.modelUtilities.Die;
import model.modelUtilities.FightTable;
import model.modelUtilities.NormalFightTable;
import model.characterModel.Character;
import model.characterModel.CharacterIsDeadException;

public class FightCommand implements CommandInterface {
	private Die d10 = new Die(10);
	private Character hero;
	private Monster villain;
	private FightTable ft = new NormalFightTable();

	public FightCommand(Monster monster, Character character){
		this.villain = monster;
		this.hero = character;
		
	}
	@Override
	public void execute() throws MonsterIsDeadException, CharacterIsDeadException {
		System.out.println("the round begins");
		if(agilityCheck() > 0){
		characterStrike();
		monsterStrike();
		} else{
			monsterStrike();
			characterStrike(); 
		}
		System.out.println("The round is over. You have " + hero.getHitpoints() + " and the kobold has " + villain.getHitpoints() + " hitpoints left");
		

	}
	private int agilityCheck() {
		int heroTmp = 0;
		int villainTmp = 0;
		heroTmp = d10.roll()+hero.getAgility();
		villainTmp = d10.roll()+villain.getAgility();
		return heroTmp - villainTmp;
	}
	private void monsterStrike() throws CharacterIsDeadException {
		int heroTmp = 0;
		int villainTmp = 0;
		int gap = 0;
		heroTmp = d10.roll()+hero.getStrength();
		villainTmp = d10.roll()+villain.getStrength();
		gap = villainTmp - heroTmp;
		if(gap>0){
			System.out.println("You where hit by the nasty kobold! His nasty strike wounds for "+ft.hitPointsFromGap(gap) + " hitpoints");
		} else{
			System.out.println("the kobold misses your body and hisses in anger");
		}
		hero.removeHitpoints(ft.hitPointsFromGap(gap));
		}
	private void characterStrike() throws MonsterIsDeadException {
		int heroTmp = 0;
		int villainTmp = 0;
		int gap = 0;
		heroTmp = d10.roll()+hero.getStrength();
		villainTmp = d10.roll()+villain.getStrength();
		gap = heroTmp - villainTmp;
		if(gap>0){
			System.out.println("You strike the kobold so hard his candle flies through the air and he loses "+ ft.hitPointsFromGap(gap) + " hitpoints");
		}else{
			System.out.println("You strike far above the kobolds head, unused to fight such short beeings");
		}
		villain.removeHitpoints(ft.hitPointsFromGap(gap));
	}

}
