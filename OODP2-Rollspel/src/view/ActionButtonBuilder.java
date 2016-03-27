package view;

import model.roomModel.Action;
import view.mainGui.ActionButton;
import view.mainGui.GameButtonPanel;

public class ActionButtonBuilder {
	GameButtonPanel gameButtonPanel;

	public ActionButtonBuilder(GameButtonPanel gameButtonPanel) {
		this.gameButtonPanel = gameButtonPanel;
	}
	
	public void visit(Action action) {
		gameButtonPanel.add(new ActionButton(action, action.getDescription()));
	}
}
