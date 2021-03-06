package view.startGui;

import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ClassPanel extends JPanel {
	
	private static final long serialVersionUID = 2312794371052919082L;
	private ButtonGroup buttonGroup;
	private JRadioButton warrior;
	private JRadioButton rogue;
	private JRadioButton scholar;
	public ClassPanel() {
		super();
		this.setVisible(true);
		this.setPreferredSize(new Dimension(400, 100));
		buttonGroup = new ButtonGroup();
		warrior = new JRadioButton("Warrior");
		warrior.setActionCommand("warrior");
		rogue = new JRadioButton("Rogue");
		rogue.setActionCommand("rogue");
		scholar = new JRadioButton("Mysticist");
		scholar.setActionCommand("mysticist");
		buttonGroup.add(warrior);
		buttonGroup.add(rogue);
		buttonGroup.add(scholar);
		add(new JLabel("<html><h2>Class</h2></html>"));
		add(warrior);
		add(rogue);
		add(scholar);
		warrior.setSelected(true);
	}

	public String getSelectedClass() {
		return buttonGroup.getSelection().getActionCommand();
	}
}
