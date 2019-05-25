import java.awt.Graphics;

public class MenuScreen extends GamePanel{
	void drawMenuState(Graphics g) {
		
		System.out.println("menu");
		g.setColor(pink);
		g.fillRect(0, 0, 600, 800);
		g.setColor(blue);
		g.setFont(titleFont);
		g.drawString("Music Guessing Game", 34, 200);
		g.setFont(instFont);
		g.drawString("Press ENTER to start", 105, 300);
		g.drawString("Press SPACE for instructions", 60, 400);
	//change from graphic to JLables
	}
}
