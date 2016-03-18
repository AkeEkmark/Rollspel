package controller.states;

import controller.GameOutput;

public class WinState implements StateInterface {

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
		// TODO Auto-generated method stub
		
	}

}
