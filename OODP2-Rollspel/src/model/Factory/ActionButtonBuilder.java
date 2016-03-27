package model.Factory;

import model.roomModel.Action;
import view.ActionButton;
import view.GameButtonPanel;

public class ActionButtonBuilder {
	GameButtonPanel gameButtonPanel;

	public ActionButtonBuilder(GameButtonPanel gameButtonPanel) {
		this.gameButtonPanel = gameButtonPanel;
	}
	
	public void visit(Action action) {
		gameButtonPanel.add(new ActionButton(action, action.getDescription()));
	}
}
