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
	int randombutton4;
	JLabel label = new JLabel("What is the song?");
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	Random randomButton = new Random();
	void drawGameState(Graphics g) {
		
	}
GameScreen(GamePanel GP) {
Question q = new Question(null, 2);
	button1 = new JButton(Integer.toString(q.rightAns));
	button2 = new JButton(Integer.toString(q.wrongAns1));
	button3 = new JButton(Integer.toString(q.wrongAns3));
	button4 = new JButton(Integer.toString(q.wrongAns2));
	this.GP = GP;
	label.setFont(instFont);
	this.GP.add(label);
	this.GP.add(button1);
	this.GP.add(button2);
	this.GP.add(button3);
	this.GP.add(button4);
	button1.addMouseListener(this);
	button2.addMouseListener(this);
	button3.addMouseListener(this);
	button4.addMouseListener(this);
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

}
