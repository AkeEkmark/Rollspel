package model.Factory;

import model.roomModel.Action;
import view.ActionButton;
import view.GameButtonPanel;

public class ActionBuilder {
	GameButtonPanel gameButtonPanel;

	public ActionBuilder(GameButtonPanel gameButtonPanel) {
		this.gameButtonPanel = gameButtonPanel;
		

	}
	
	public void visit(Action action) {
		gameButtonPanel.add(new ActionButton(action, action.getDescription()));
	}

	public void visitFight(Action action) {
		// TODO Auto-generated method stub
		
	}

	

}
