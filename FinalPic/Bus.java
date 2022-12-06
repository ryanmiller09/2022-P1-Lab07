package FinalPic;

import java.awt.*;
import java.applet.*;

public class Bus {
    public static void drawFrame(Graphics g){
        g.setColor(Color.yellow);
        g.fillRect(500,450,450,225);
        g.fillRect(400,550,100,125);

    }
    public static void drawWheels(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(550,600,150,150);
        g.setColor(Color.lightGray);
        g.drawOval(549,599,150,150);
        g.drawOval(548,598,151,151);
        g.drawOval(547,597,152,152);
        g.setColor(Color.BLACK);
        g.fillOval(750,600,150,150);
        g.setColor(Color.lightGray);
        g.drawOval(749,599,150,150);
        g.drawOval(748,598,151,151);
        g.drawOval(747,597,152,152);
    }
    public static void drawWindows(Graphics g){
        g.setColor(Color.cyan);
        g.fillRect(520,470,90,40);
        g.fillRect(630,470,60,40);
        g.fillRect(710,470,60,40);
        g.fillRect(790,470,60,40);
        g.fillRect(870,470,60,40);
    }
}
