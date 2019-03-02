import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

//Need to make a state for when people get right answer and press enter to go on, and endstate to go off if 
//timer runs out or wrong answer. Alsp need to put actionlistner into each state for enter. End credits saying the player lost or won
public class GamePanel extends JPanel implements MouseListener, KeyListener, ActionListener {
	Font titleFont;
	Font instFont;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Color pink = new Color(187, 051, 136);
	Color blue = new Color(051, 136, 255);
	String answer1;
	String answer2;
	String answer3;
	String answer4;

	GamePanel() {
		Timer time = new Timer(15000, this);
		JButton button1 = new JButton(answer1);
		JButton button2 = new JButton(answer2);
		JButton button3 = new JButton(answer3);
		JButton button4 = new JButton(answer4);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		instFont = new Font("Arial", Font.PLAIN, 30);

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

	}

	void drawEndState(Graphics g) {

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
