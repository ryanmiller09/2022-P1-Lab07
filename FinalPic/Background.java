package FinalPic;

import java.awt.*;
import java.applet.*;

public class Background {
    public static void drawSky(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(0,0,1000,500);
    }
    public static void drawStreet(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,500,1000,500);
    }

    public static void drawLines(Graphics g){
        g.setColor(Color.yellow);
        g.fillRect(0,700,1000,25);
        g.fillRect(0,750,1000,25);
    }
    public static void drawSun(Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(875,25,100,100);
    }
}


