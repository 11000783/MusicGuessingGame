
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



@SuppressWarnings("serial")
public class Screen extends JPanel {
    static final int WIDTH = 600;
    static final int HEIGHT = 800;
    
     
    Audio birthday = new Audio("happyB.mp3");
    Audio sugarplum = new Audio("sugarPlum.mp3");
    Audio bohemian = new Audio("bohemian.mp3");
    Audio dontstopbelievin = new Audio("dontstopbelieven.mp3");
    Audio flowers= new Audio("waltzFlowers.mp3");
    Audio likeit = new Audio("likeit.mp3");

    
    JFrame frame;
    GridBagConstraints c;
    Color backgroundColor;
    Audio audio;
    Visual visual;
    
    public Screen( JFrame frame ) {
        this.frame = frame;
        
        visual = new Visual();
        c = new GridBagConstraints();
        
        frame.setPreferredSize( new Dimension( Screen.WIDTH, Screen.HEIGHT ) );
        
        
        // Default panel layout, can be changed
        this.setLayout( new GridBagLayout() );
        this.frame.pack();
    }
    
    public void setup() {
        this.revalidate();
        this.repaint();
        this.frame.pack();
    }
    
    public void cleanUp() {
        this.removeAll();
        this.frame.getContentPane().remove( this );
        this.frame.requestFocus();
    }
}
