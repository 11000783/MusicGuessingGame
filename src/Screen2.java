import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Screen2 extends Screen implements ActionListener, MouseListener {
	Font titleFont = new Font("Arial", Font.BOLD, 60);
//	JLabel labelTitleImage;
	JLabel labelTitle;
	JLabel labelScore;
	JLabel labelPlay;
	JLabel labelStop;
	JLabel labelGuessSong;
	JButton button1;
	JButton button2;
	JTextField answer;
	JPanel a;
	JPanel b;
	JPanel c;
	int score;
	Timer timer;
	long counter;
	Audio song;
	MussicGuessingGame game;
	int rannum;
	String rightwrong;
	int question;

	public Screen2(MussicGuessingGame game) {
		super(game.frame);
		rightwrong = "Press the play song button for a song to play then write the answer in the text feild then press submit. If you get it right you get a point";
		rannum = random.nextInt(answers.length);
		this.game = game;
		timer = new Timer(1000, this);
		score = 0;
		counter = 0;
		question = 0;
		song = new Audio("raven.mp3");
		labelGuessSong = new JLabel("Guess the song");
		//labelPlay = visual.createLabelImage("play.jpg", 50, 50);
		//labelPlay.setPreferredSize(new Dimension(50, 50));
	//	labelPlay.addMouseListener(this);

		//labelStop = visual.createLabelImage("stop.jpg", 50, 50);
		//labelStop.setPreferredSize(new Dimension(50, 50));
		//labelStop.addMouseListener(this);

		labelTitle = new JLabel();
		labelScore = new JLabel();

		labelTitle.setFont(new Font("Arial", Font.PLAIN, 20));
		labelScore.setFont(new Font("Arial", Font.PLAIN, 10));
		labelScore.setText("Score: " + score);
		labelTitle.setText(rightwrong);
	//	labelTitleImage = visual.createLabelImage("Space.png", 400, 200);
		button1 = new JButton("PLAY SONG");
		answer = new JTextField();
		button2 = new JButton("Submit");
		// Don't allow button presses to shift focus off the keyListener in the frame
		button1.setFocusable(false);
		button1.addActionListener(this);
		button2.setFocusable(false);
		button2.addActionListener(this);

	}

	public void setup() {
		game.frame.setTitle("Music Guessing Game");
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		a = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(Color.BLACK);
				g.setFont(new Font("Arial", Font.PLAIN, 30));
				g.drawString("Score: " + score, 30, 30);
				g.drawString("Question: " + question, 400, 30);
			}
		};
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
		addButton1();
		addButton2();
		addTextFeild();
		game.frame.pack();
		this.repaint();
		timer.start();

	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial", Font.PLAIN, 100));
		if (score == 5) {
			g.setFont(new Font("Arial", Font.PLAIN, 30));
			g.drawString("Good Job", 200, 300);
			g.drawString("Score: " + score, 30, 30);
			g.drawString("Question: " + question, 400, 30);
		} else {
			g.setFont(new Font("Arial", Font.PLAIN, 30));
			g.drawString("Score: " + score, 30, 30);
			g.drawString("Question: " + question, 400, 30);
			g.drawString("Bad Job", 200, 300);
		}

	}

	private void addTitle() {
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.CENTER;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.weighty = 0;
		gc.gridy = 1;
		//a.add(labelTitleImage, gc);

		gc.fill = GridBagConstraints.NONE;
		gc.gridy = 2;
		a.add(labelTitle, gc);

	}

	private void addButton1() {
		GridBagConstraints gc = new GridBagConstraints();

		button1.setPreferredSize(new Dimension(200, 20));

		gc.anchor = GridBagConstraints.CENTER;
		gc.fill = GridBagConstraints.HORIZONTAL;
		b.add(button1, gc);

	}

	private void addButton2() {
		GridBagConstraints gc = new GridBagConstraints();

		button2.setPreferredSize(new Dimension(200, 20));

		gc.anchor = GridBagConstraints.CENTER;
		gc.fill = GridBagConstraints.HORIZONTAL;
		c.add(button2, gc);

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
		//b.add(labelStop, gc);

		gc.gridx = 1;
		gc.gridy = 1;
		//b.add(labelPlay, gc);
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
			labelTitle.setText(rightwrong);
			this.repaint();
		} else {
			JButton buttonPressed = (JButton) arg0.getSource();

			if (buttonPressed == button1) {
				System.out.println("button 1 pressed");

				// song plays again
				Songs[rannum].play(Audio.PLAY_ENTIRE_SONG);

			}
			if (button2 == buttonPressed) {
				String userresponse = answer.getText();

				if (userresponse.equalsIgnoreCase(answers[rannum])) {
					score++;
					question++;
					rightwrong = "RIGHT";
				} else {
					rightwrong = "WRONG";
					question++;
				}
				reset();
				repaint();
			}
			if (question == 5) {
				if (score == 5) {
					rightwrong = "Good Job";
					remove(a);
					remove(b);
					remove(c);

				} else {
					rightwrong = "Bad Job";
					remove(a);
					remove(b);
					remove(c);
				}
			}
		}

	}

	private void reset() {
		// TODO Auto-generated method stub
		rannum = new Random(new Date().getTime()).nextInt(answers.length);
		answer.setText("");
		labelScore.setText("");
		Songs[rannum].stop();

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
