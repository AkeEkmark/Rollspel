package controller.states;

import controller.GameOutput;

public class DefeatState implements StateInterface {

	@Override
	public void interactionLoop() {
		GameOutput.addGameText("Your life and adventure ends here.", false);
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
