import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

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
		GameScreen gamepanel = new GameScreen(null);
		MenuScreen menupanel = new MenuScreen();
		frame.setVisible(true);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		
	}

}