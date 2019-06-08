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

import snoose.EndScreen;
import snoose.GameScreen;
import snoose.MenuScreen;

public class GamePanel extends JFrame implements MouseListener, KeyListener, ActionListener {
	Font titleFont;
	Font instFont;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Color pink = new Color(187, 051, 136);
	Color blue = new Color(051, 136, 255);
	Color purple = new Color(102, 034, 136);
	Color black = new Color(0, 0, 0);
	int randombutton1;
	int randombutton2;
	int randombutton3;
	int randombutton4;
	QuestionManager manager = new QuestionManager();
	Question question = new Question(4);
	String[] songs = manager.songs;
	Question[] questions = manager.questions;
JLabel label = new JLabel("What is the song?");
	JButton button1 = new JButton(Integer.toString(randombutton1));
	JButton button2 = new JButton(Integer.toString(randombutton2));
	JButton button3 = new JButton(Integer.toString(randombutton3));
	JButton button4 = new JButton(Integer.toString(randombutton4));
	Random randomButton = new Random();

	GamePanel() {
		Timer time = new Timer(15000, this);
		ArrayList<Integer> Answers = new ArrayList<Integer>();
		Answers.add(question.wrongAns1);
		Answers.add(question.wrongAns2);
		Answers.add(question.wrongAns3);
		Answers.add(question.rightAns);

		titleFont = new Font("Playfair Display", Font.PLAIN, 48);
		instFont = new Font("Playfair Display", Font.PLAIN, 32);

		System.out.println("Panel");
		

		for (int i = 0; i < 4; i++) {
			int randomButtons = randomButton.nextInt(Answers.size());
			int answers = Answers.get(randomButtons);
		}
//	    private void startGame() {
//	        frame = new JFrame( "Snoose" );
//	        frame.setVisible( true );
//	        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
//	        frame.addKeyListener( this );
//	        
//	        menu = new MenuScreen( frame );
//	        game = new GameScreen( frame );
//	        end  = new EndScreen( frame );
//	        
//	        menu.drawMenu();
//	    }
//		 randomButtons = randombutton1;
//		 if (randomButtons != randombutton1) {
//		 randombutton2 = randomButtons;
//		 }
//		 else if (randomButtons != randombutton1 && randombutton2 != randomButtons) {
//		 randombutton3 = randomButtons;
//		 }
//		 else if (randomButtons != randombutton1 && randombutton2 != randomButtons &&
//		 randombutton3 != randomButtons) {
//		 randombutton4 = randomButtons;
//		 }

	}




	public void paintComponent(Graphics g) {

		if (currentState == MENU_STATE) {

			drawMenuState(g);

		} else if (currentState == GAME_STATE) {

			drawGameState();

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
		System.out.println(currentState);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("key");
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {

			currentState++;
			if (currentState > END_STATE) {
				currentState = MENU_STATE;
				
			}
			else if (currentState == GAME_STATE) {
				//setBackground(purple);
				label.setFont(instFont);
				add(label);
				add(button1);
				add(button2);
				add(button3);
				add(button4);
				button1.addMouseListener(this);
				button2.addMouseListener(this);
				button3.addMouseListener(this);
				button4.addMouseListener(this);
		
			}
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
