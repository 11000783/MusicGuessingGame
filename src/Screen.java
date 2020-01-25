
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
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//birthday sugarplum crop 33-39, 

@SuppressWarnings("serial")
public class Screen extends JPanel {
    static final int WIDTH = 600;
    static final int HEIGHT = 800;
    
   

    Audio hbremix = new Audio("hbremix.wav");
    Audio sugarplum = new Audio("sugarPlum.wav");
    Audio bohemian = new Audio("bohemian.wav");
    Audio dontstopbelievin = new Audio("dontstopbelieven.wav");
    Audio flowers= new Audio("waltzFlowers.wav");
    Audio likeit = new Audio("likeit.wav");
    Audio[]Songs = {      hbremix,  sugarplum, bohemian, dontstopbelievin, flowers, likeit};
    String[] answers = { "Happy Birthday Remix",  "Dance of the Sugar Plum", "Bohemian Rhapsody", "Don't Stop Beliven", "Waltz of the Flowers", "Like it"};
    JFrame frame;
    GridBagConstraints c;
    Color backgroundColor;
    Audio audio;
    Visual visual;
    Random random = new Random(answers.length);
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
