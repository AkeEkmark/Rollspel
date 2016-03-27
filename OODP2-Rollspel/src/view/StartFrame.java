package view;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;

import controller.Facade;

public class StartFrame extends JFrame implements ComponentListener {

	private static final long serialVersionUID = -6184805931775692675L;
	private ChoicePanel choicePanel;
	private Facade facade;
	private Gui gui;

	public StartFrame(Facade facade, Gui gui) {
		super();
		this.facade = facade;
		this.gui = gui;
		
	}
	public void start() {
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setName("Rollspel");
		this.setSize(400, 400);
		this.setLocationRelativeTo(gui);
		choicePanel = new ChoicePanel(facade, gui);
		choicePanel.addComponentListener(this);
		this.add(choicePanel);
		this.setVisible(true);
	}
	@Override
	public void componentResized(ComponentEvent e) {	
	}
	@Override
	public void componentMoved(ComponentEvent e) {	
	}
	@Override
	public void componentShown(ComponentEvent e) {
	}
	@Override
	public void componentHidden(ComponentEvent e) {
		this.dispose();
		
	}
}
