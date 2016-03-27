package controller.states;

import controller.GameOutput;

public class DefeatState implements StateInterface {
	
	private StateInterface defaultState;

	@Override
	public void interactionLoop() {
		System.out.println("DefeatState "+this);
		GameOutput.addGameText("Your life and adventure ends here.", false);
	}

	@Override
	public void changeState(StateInterface state) {
		state.interactionLoop();	
	}

	@Override
	public void setDefaultState(StateInterface state) {
		this.defaultState = state;
		
	}

}
