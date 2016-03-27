package view.mainGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.roomModel.Action;

public class ActionButton extends JButton {

	private static final long serialVersionUID = 8539253817922194600L;
	private Action action;

	public ActionButton(Action action, String description) {
		super(description);
		this.action = action;
		addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				action.execute();	
			}
		});
	}
	


}
