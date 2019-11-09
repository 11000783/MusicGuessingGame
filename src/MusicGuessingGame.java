import java.awt.Dimension;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MusicGuessingGame {

	public static void main(String[] args) {
 new MusicGuessingGame().setup();
	}

	static final int width = 600;
	static final int height = 600;
    JFrame frame = new JFrame( "Music Guessing Game" );
	

	void setup() {
		GamePanel setup = new GamePanel();
		frame.setVisible(true);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(setup);
		frame.pack();
		frame.addKeyListener(setup);
		
	}

}