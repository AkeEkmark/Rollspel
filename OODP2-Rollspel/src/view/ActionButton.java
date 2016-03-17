package view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.roomModel.Action;

public class ActionButton extends JButton {
	Action action;

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
