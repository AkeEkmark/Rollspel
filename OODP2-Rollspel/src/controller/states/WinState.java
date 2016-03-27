package controller.states;

import controller.GameOutput;

public class WinState implements StateInterface {
	
	private StateInterface defaultState;

	@Override
	public void interactionLoop() {
		GameOutput.addGameText("You win !", false);
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
