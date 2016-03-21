package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Facade;

public class ChoicePanel extends JPanel implements ActionListener {
	private Facade facade;
	private NamePanel namePanel;
	ClassPanel classPanel;

	private static final long serialVersionUID = 8049779219317678941L;

	public ChoicePanel(Facade facade) {
		super();
		this.setVisible(true);
		this.facade = facade;
		add(new InformationPanel());
		namePanel = new NamePanel();
		add(namePanel);
		classPanel = new ClassPanel();
		add(classPanel);
		JButton startButton = new JButton("<html><h1>Start</h1></html>");
		add(startButton);
		startButton.addActionListener(this);
		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		facade.createChar(namePanel.getCharName(), classPanel.getSelectedClass());
		
		
	}

}
