import java.awt.Graphics;

public class MenuScreen extends GamePanel{
	
	void drawMenuState(Graphics g) {		
		System.out.println("menu");
		g.setColor(pink);
		g.fillRect(0, 0, 600, 800);
		g.setColor(black);
		g.setFont(titleFont);
		g.drawString("Music Guessing Game", 34, 200);
		g.setFont(instFont);
		g.drawString("Press ENTER to start", 105, 300);
	}

}
