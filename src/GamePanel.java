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
//Next time I need to make it so when click one button with answer says correct, etc. And make answers and question come up at random 
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
QuestionManager manager = new QuestionManager();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
	GamePanel() {
		Timer time = new Timer(15000, this);
		titleFont = new Font("Playfair Display", Font.PLAIN, 48);
		instFont = new Font("Playfair Display", Font.PLAIN, 32);
		add(button1);
		add(button2);
		add(button3);
		add(button4);

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
