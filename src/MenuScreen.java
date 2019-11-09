import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MenuScreen {
	Color pink = new Color(187, 051, 136);
	Color blue = new Color(051, 136, 255);
	Color purple = new Color(102, 034, 136);
	Color black = new Color(0, 0, 0);
	Font titleFont = new Font("Arial", Font.PLAIN, 35);
	Font instFont = new Font("Arial", Font.PLAIN, 25);
	GamePanel menuscreen;
	public MenuScreen(GamePanel g) {
		this.menuscreen = g;
		
	}
	void drawMenuState(Graphics g) {		
		g.setColor(pink);
		g.fillRect(0, 0, 600, 800);
		g.setColor(black);
		g.setFont(titleFont);
		g.drawString("Music Guessing Game", 100, 250);
		g.setFont(instFont);
		g.drawString("Press ENTER to start", 135, 300);
	}

}
