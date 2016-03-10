package view;

import javax.swing.JFrame;

public class Gui extends JFrame{

	private static final long serialVersionUID = 211431534849779406L;

	public Gui() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setName("Rollspel");
		this.setSize(800, 600);
		this.setVisible(true);
		this.add(new GamePanel("GamePanel"));
	}
}
