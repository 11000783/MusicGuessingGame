import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

import snoose.EndScreen;
import snoose.GameScreen;
import snoose.MenuScreen;

public class MusicGuessingGame {

	public static void main(String[] args) {
 new MusicGuessingGame().setup();
	}

	static final int width = 600;
	static final int height = 600;
    JFrame frame = new JFrame( "Music Guessing Game" );
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();

	void setup() {
		EndScreen endpanel = new EndScreen();
		GameScreen gamepanel = new GameScreen();
		MenuScreen menupanel = new MenuScreen();
		frame.add(endpanel);
		frame.add(gamepanel);
		frame.add(menupanel);
		frame.addKeyListener(endpanel);
		frame.addKeyListener(gamepanel);
		frame.addKeyListener(menupanel);
		frame.setVisible(true);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		
	}

}