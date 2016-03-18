package controller.states;

public interface StateInterface {
	public void interactionLoop();
	public void changeState(StateInterface state);
	public void setDefaultState(StateInterface state);
}
