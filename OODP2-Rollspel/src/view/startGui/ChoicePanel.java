package view.startGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import controller.Facade;
import view.mainGui.Gui;

public class ChoicePanel extends JPanel implements ActionListener {
	private Facade facade;
	private NamePanel namePanel;
	private ClassPanel classPanel;
	private Gui gui;

	private static final long serialVersionUID = 8049779219317678941L;

	public ChoicePanel(Facade facade, Gui gui) {
		super();
		this.facade = facade;
		this.gui = gui;
		add(new InformationPanel());
		namePanel = new NamePanel();
		add(namePanel);
		classPanel = new ClassPanel();
		add(classPanel);
		JButton startButton = new JButton("<html><h1>Start</h1></html>");
		add(startButton);
		startButton.addActionListener(this);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		facade.createChar(namePanel.getCharName(), classPanel.getSelectedClass());
		Thread guiThread = new Thread(gui);
		guiThread.start();
		this.setVisible(false);
		this.setEnabled(false);
	}

}
