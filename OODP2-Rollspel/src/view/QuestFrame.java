package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.entitiesModel.Quest;

public class QuestFrame extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = -4601307154001802491L;
	private Quest quest;
	private JPanel questionPanel;
	private JTextArea questionTextArea;
	private JTextField questionAnswerField;

	public QuestFrame(Quest quest) {
		super();
		this.quest = quest;
	}

	public void start() {
		this.setLocationRelativeTo(null);
		addPanel(quest);
		this.setSize(640, 480);
		this.setVisible(true);
	}

	private void addPanel(Quest quest) {
		questionPanel = new JPanel();
		questionTextArea = new JTextArea(quest.getDescription(), 10, 40);
		questionPanel.add(questionTextArea);
		questionAnswerField = new JTextField(10);
		questionPanel.add(questionAnswerField);
		questionPanel.setVisible(true);
		add(questionPanel);
		questionAnswerField.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		quest.setPlayerAnswer(questionAnswerField.getText());
		quest.setDone();
		this.dispose();
	}

}
