
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
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

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
    Screen2 labelScore;
    Screen2 score;
Audio celine = new Audio("celine.wav");
Audio dancewithsomebody = new Audio("dancewithsomebody.wav");
Audio dancingqueen = new Audio("dancingqueen.wav");
Audio kermit = new Audio("kermit.wav");
    Audio hbremix = new Audio("hbremix.wav");
    Audio sugarplum = new Audio("sugarPlum.wav");
    Audio bohemian = new Audio("bohemian.wav");
    Audio dontstopbelievin = new Audio("dontstopbelievin.wav");
    Audio flowers= new Audio("waltzFlowers.wav");
    Audio likeit = new Audio("likeit.wav");
    Audio babyshark = new Audio("babyshark.wav");
    Audio lavieenrose = new Audio("lavieenrose.wav");
    Audio romanholiday = new Audio("Roman Holiday.wav");
    Audio shoulder = new Audio("shoulder.wav");
    Audio love = new Audio("love.wav");
    Audio[]Songs = { love, shoulder, romanholiday, lavieenrose, babyshark, kermit, dancewithsomebody, dancingqueen, celine,  hbremix,  sugarplum, bohemian, dontstopbelievin, flowers, likeit};
    String[] answers = { "L.O.V.E", "Put Your Head On My Shoulder", "Roman Holiday", "La Vie En Rose","Baby Shark", "It's Not Easy Being Green", "I Wanna Dance With Somebody", "Dancing Queen", "My Heart Will Go On", "Happy Birthday Remix",  "Dance of the Sugar Plum", "Bohemian Rhapsody", "Don't Stop Beliven", "Waltz of the Flowers", "Like it"};
    JFrame frame;
    GridBagConstraints c;
    Color backgroundColor;
    Audio audio;
    Visual visual;
    Random random = new Random(new Date().getTime());
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
