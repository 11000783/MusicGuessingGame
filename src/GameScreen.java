import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameScreen implements MouseListener{
	Color pink = new Color(187, 051, 136);
	Color blue = new Color(051, 136, 255);
	Color purple = new Color(102, 034, 136);
	Color black = new Color(0, 0, 0);
	Font titleFont;
	Font instFont;
	GamePanel GP;
	int randombutton1;
	int randombutton2;
	int randombutton3;
	JLabel label = new JLabel("What is the song?");
	JButton button1;
	JButton button2;
	JButton button3;
	Random randomButton = new Random();
	 GamePanel gamescreen;
	void drawGameState(Graphics g) {
		
	}
GameScreen(GamePanel GP) {

	Question q  = new Question(null, 2);
	this.GP = GP;
	label.setFont(instFont);
	button1 = new JButton();
	button2 = new JButton();
	button3 = new JButton();
	this.gamescreen = GP;
	
}
//new method called playsong((input peramiter) String Song title(from hashmap)) and make a random method to
//chose a random song
//mouse listener when click Jbutton change score and button.setText to new random wrong answers and
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
void setUp() {
	this.GP.removeAll();
	this.GP.add(label);
	this.GP.add(button1);
	this.GP.add(button2);
	this.GP.add(button3);
	button1.addMouseListener(this);
	button2.addMouseListener(this);
	button3.addMouseListener(this);

	
}
}
