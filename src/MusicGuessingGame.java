import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MusicGuessingGame {

	public static void main(String[] args) {
 
	}

	static final int width = 600;
	static final int height = 600;
	JFrame frame = new JFrame();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();

	void setup() {
		GamePanel panel = new GamePanel();
		frame.add(panel);
		frame.addKeyListener(panel);
		frame.setVisible(true);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}

}