import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Screen2 extends Screen implements ActionListener, MouseListener {
	Font titleFont = new Font("Arial", Font.BOLD, 60);
	JLabel labelTitleImage;
	JLabel labelTitle;
	JLabel labelScore;
	JLabel labelPlay;
	JLabel labelStop;
	JLabel labelGuessSong;
	JButton button1;
	JTextField answer;
	JPanel a;
	JPanel b;
	JPanel c;

	Timer timer;
	long counter;
	Audio song;
	MussicGuessingGame game;

	public Screen2(MussicGuessingGame game) {
		super(game.frame);
		this.game = game;

		timer = new Timer(1000, this);
		counter = 0;
		song = new Audio("raven.mp3");

		labelGuessSong = new JLabel("Guess the song");

		labelPlay = visual.createLabelImage("play.jpg", 50, 50);
		labelPlay.setPreferredSize(new Dimension(50, 50));
		labelPlay.addMouseListener(this);

		labelStop = visual.createLabelImage("stop.jpg", 50, 50);
		labelStop.setPreferredSize(new Dimension(50, 50));
		labelStop.addMouseListener(this);

		labelTitle = new JLabel();
		labelScore = new JLabel();
		labelTitle.setFont(new Font("Arial", Font.PLAIN, 20));
		labelScore.setFont(new Font("Arial", Font.PLAIN, 10));
		labelScore.setText("score");
		labelTitle.setText("wrong or right ");
		labelTitleImage = visual.createLabelImage("Space.png", 400, 200);
		button1 = new JButton("play again");
		answer = new JTextField();
		// Don't allow button presses to shift focus off the keyListener in the frame
		button1.setFocusable(false);
		button1.addActionListener(this);

	}

	public void setup() {
		game.frame.setTitle("Music Guessing Game");
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		a = new JPanel();
		b = new JPanel();
		c = new JPanel();

		a.setLayout(new GridBagLayout());
		b.setLayout(new GridBagLayout());
		c.setLayout(new GridBagLayout());

		a.setBackground(Color.RED);
		b.setBackground(Color.GREEN);
		c.setBackground(Color.BLUE);

		a.setMaximumSize(new Dimension(Screen.WIDTH, Screen.HEIGHT / 2));
		b.setMaximumSize(new Dimension(Screen.WIDTH, Screen.HEIGHT / 4));
		c.setMaximumSize(new Dimension(Screen.WIDTH, Screen.HEIGHT / 4));

		a.setAlignmentX(Component.LEFT_ALIGNMENT);
		b.setAlignmentX(Component.LEFT_ALIGNMENT);
		c.setAlignmentX(Component.LEFT_ALIGNMENT);

		this.add(a);
		this.add(b);
		this.add(c);

		addTitle();
		addImages();
		addButtons();
		addTextFeild();
		game.frame.pack();
		this.repaint();
		timer.start();
	}

	private void addTitle() {
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.CENTER;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.weighty = 0;
		gc.gridy = 1;
		a.add(labelTitleImage, gc);

		gc.fill = GridBagConstraints.NONE;
		gc.gridy = 2;
		a.add(labelTitle, gc);

	}

	private void addButtons() {
		GridBagConstraints gc = new GridBagConstraints();

		button1.setPreferredSize(new Dimension(200, 20));

		gc.anchor = GridBagConstraints.CENTER;
		gc.fill = GridBagConstraints.HORIZONTAL;
		b.add(button1, gc);

	}

	private void addTextFeild() {
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.anchor = GridBagConstraints.CENTER;
		gc.fill = GridBagConstraints.HORIZONTAL;
		answer.setPreferredSize(new Dimension(200, 20));
		c.add(answer, gc);
	}

	private void addImages() {
		GridBagConstraints gc = new GridBagConstraints();

		gc.anchor = GridBagConstraints.CENTER;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridwidth = 3;
		b.add(labelGuessSong, gc);

		gc.anchor = GridBagConstraints.CENTER;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.gridx = 0;
		gc.gridy = 1;
		gc.gridwidth = 1;
		b.add(labelStop, gc);

		gc.gridx = 1;
		gc.gridy = 1;
		b.add(labelPlay, gc);
	}

	public void cleanUp() {
		timer.stop();
		counter = 0;

		super.cleanUp();

		if (song != null) {
			song.stop();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == timer) {
			labelTitle.setText("wrong or right ");
			this.repaint();
		} else {
			JButton buttonPressed = (JButton) arg0.getSource();

			if (buttonPressed == button1) {
				System.out.println("button 1 pressed");
				
				// song plays again
				bohemian.play(Audio.PLAY_ENTIRE_SONG);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bohemian.stop();
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		Object objClicked = arg0.getSource();

		if (objClicked == labelPlay) {
			System.out.println("play song");
			song.stop();
			song.play(3);
		} else if (objClicked == labelStop) {
			System.out.println("stop song");
			song.stop();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

	}

	@Override
	public void mousePressed(MouseEvent arg0) {

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {

	}
}
