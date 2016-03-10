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
		if(agilityCheck() > 0){
		characterStrike();
		monsterStrike();
		} else{
			monsterStrike();
			characterStrike(); 
		}
		
		

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
		hero.removeHitpoints(ft.hitPointsFromGap(gap));
	}
	private void characterStrike() throws MonsterIsDeadException {
		int heroTmp = 0;
		int villainTmp = 0;
		int gap = 0;
		heroTmp = d10.roll()+hero.getStrength();
		villainTmp = d10.roll()+villain.getStrength();
		gap = heroTmp - villainTmp;
		villain.removeHitpoints(ft.hitPointsFromGap(gap));
	}

}
