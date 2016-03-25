package model.entitiesModel;

public class DeathTrap extends Trap {

	
	public DeathTrap(){
	super.damage = 500;
	super.difficulty = 500;
	super.hasTriggered = false;
	super.description = "";
	}
	
	@Override
	public int getDifficulty() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getdamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasTriggered() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setTriggered() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHitDesc() {
		// TODO Auto-generated method stub
		return "Your life as you know it and your adventure ends here.";
	}

	@Override
	public String getMissDesc() {
		// TODO Auto-generated method stub
		return null;
	}

}
