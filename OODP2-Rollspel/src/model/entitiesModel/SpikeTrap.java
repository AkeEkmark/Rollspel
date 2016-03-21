package model.entitiesModel;

public class SpikeTrap extends Trap {

	public SpikeTrap(){
		super.damage = 10;
		super.difficulty = 25;
	}
	@Override
	public int getDifficulty() {
		return difficulty;
	}

	@Override
	public int getdamage() {
		return damage;
	}

}
