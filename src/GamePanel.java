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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements MouseListener, KeyListener, ActionListener {
	Font titleFont;
	Font instFont;
	final static int MENU_STATE = 0;
	final static int GAME_STATE = 1;
	final static int END_STATE = 2;
	static int currentState = MENU_STATE;
	Color pink = new Color(187, 051, 136);
	Color blue = new Color(051, 136, 255);
	Color purple = new Color(102, 034, 136);
	Color black = new Color(0, 0, 0);
    
	EndScreen end = new EndScreen(this);
	GameScreen game = new GameScreen(this);
	MenuScreen menu = new MenuScreen(this);
	QuestionManager manager = new QuestionManager();
	GamePanel gamepanel;

	


	GamePanel() {


		titleFont = new Font("Playfair Display", Font.PLAIN, 48);
		instFont = new Font("Playfair Display", Font.PLAIN, 32);

		System.out.println("Panel");
		





	}
public static void SwitchState(int state) {
	if (state > END_STATE) {
		currentState = MENU_STATE;
		
	}
	else {	
		currentState = state;

	}
}



	public void paintComponent(Graphics g) {

		if (currentState == MENU_STATE) {

			menu.drawMenuState(g);

		} else if (currentState == GAME_STATE) {

			game.drawGameState(g);

		} else if (currentState == END_STATE) {

			end.drawEndState(g);
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
		System.out.println(currentState);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("key");
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
SwitchState(currentState + 1);
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
