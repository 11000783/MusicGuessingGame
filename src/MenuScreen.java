import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MenuScreen {
	Color pink = new Color(187, 051, 136);
	Color blue = new Color(051, 136, 255);
	Color purple = new Color(102, 034, 136);
	Color black = new Color(0, 0, 0);
	Font titleFont;
	Font instFont;
	void drawMenuState(Graphics g, GamePanel GP) {		
		g.setColor(pink);
		g.fillRect(0, 0, 600, 800);
		g.setColor(black);
		g.setFont(titleFont);
		g.drawString("Music Guessing Game", 34, 200);
		g.setFont(instFont);
		g.drawString("Press ENTER to start", 105, 300);
	}

}
