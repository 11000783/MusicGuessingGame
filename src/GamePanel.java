import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements MouseListener, KeyListener, ActionListener {
	Font titleFont;
	Font instFont;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Color pink = new Color(187, 051, 136);
	Color blue = new Color(051, 136, 255);
	Color purple = new Color(102, 034, 136);
	Color black = new Color(0,0,0);
	int randombutton1;
	int randombutton2;
	int randombutton3;
	int randombutton4;
QuestionManager manager = new QuestionManager();
Question question = new Question(4);
String[] songs = manager.songs;
Question[] questions = manager.questions;

JButton button1 = new JButton(Integer.toString(randombutton1));
JButton button2 = new JButton(Integer.toString(randombutton2));
JButton button3 = new JButton(Integer.toString(randombutton3));
JButton button4 = new JButton(Integer.toString(randombutton4));

Random randomButton = new Random();
	GamePanel() {
		Timer time = new Timer(15000, this);
ArrayList <Integer> Answers = new ArrayList <Integer>();
Answers.add(question.wrongAns1);
Answers.add(question.wrongAns2);
Answers.add(question.wrongAns3);
Answers.add(question.rightAns);
// JButton[] Jbutton = new JButton[4];
	titleFont = new Font("Playfair Display", Font.PLAIN, 48);
		instFont = new Font("Playfair Display", Font.PLAIN, 32);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
for (int i = 0; i < 4; i++) {
	int randomButtons = randomButton.nextInt(Answers.size());
int answers = Answers.get(randomButtons);
}
		//		
//		randomButtons = randombutton1;
//		if (randomButtons != randombutton1) {
//			randombutton2 = randomButtons;
//		}
//		else if (randomButtons != randombutton1 && randombutton2 != randomButtons) {
//			randombutton3 = randomButtons;
//	}
//		else if (randomButtons != randombutton1 && randombutton2 != randomButtons && randombutton3 != randomButtons) {
//			randombutton4 = randomButtons;
//	}
		
	}
	void drawMenuState(Graphics g) {
		g.setColor(pink);
		g.fillRect(0, 0, 600, 800);
		g.setColor(blue);
		g.setFont(titleFont);
		g.drawString("Music Guessing Game", 34, 200);
		g.setFont(instFont);
		g.drawString("Press ENTER to start", 105, 300);
		g.drawString("Press SPACE for instructions", 60, 400);
		

	}

	void drawGameState(Graphics g) {
		g.setColor(purple);
		g.fillRect(0, 0, 600, 800);
		g.setFont(instFont);
		g.drawString("What is the song?", 34, 200);
		
		
	}

	void drawEndState(Graphics g) {
g.setColor(black);
	}

	public void paintComponent(Graphics g) {

		if (currentState == MENU_STATE) {

			drawMenuState(g);

		} else if (currentState == GAME_STATE) {

			drawGameState(g);

		} else if (currentState == END_STATE) {

			drawEndState(g);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;
			repaint();
	}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// This is when timer runs out
	}

}
