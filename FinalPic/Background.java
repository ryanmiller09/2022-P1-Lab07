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
}


