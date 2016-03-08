package model.modelUtilities;

public class Die implements Dice {
	
	private int sides;
	public Die(int sides){
		this.sides = sides;
	}
	@Override
	public int roll() {
		return (int) Math.ceil(Math.random() * sides);
	}	
}

