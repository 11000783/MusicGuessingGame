import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameScreen extends GamePanel {
	int randombutton1;
	int randombutton2;
	int randombutton3;
	int randombutton4;
	JLabel label = new JLabel("What is the song?");
	JButton button1 = new JButton(Integer.toString(randombutton1));
	JButton button2 = new JButton(Integer.toString(randombutton2));
	JButton button3 = new JButton(Integer.toString(randombutton3));
	JButton button4 = new JButton(Integer.toString(randombutton4));
	Random randomButton = new Random();
	void drawGameState(Graphics g) {
		g.
	}
GameScreen() {
	ArrayList<Integer> Answers = new ArrayList<Integer>();
	Answers.add(question.wrongAns1);
	Answers.add(question.wrongAns2);
	Answers.add(question.wrongAns3);
	Answers.add(question.rightAns);
	for (int i = 0; i < 4; i++) {
		int randomButtons = randomButton.nextInt(Answers.size());
		int answers = Answers.get(randomButtons);
	}
	
}
}
