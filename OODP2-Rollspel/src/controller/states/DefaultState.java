package controller.states;

public class DefaultState implements StateInterface {

	@Override
	public void interactionLoop() {
		System.out.println("Standing in the room");
	}

}