package FinalPic;

import java.awt.*;
import java.applet.*;

public class Car {
    public static void drawBody(Graphics g){
        g.setColor(Color.pink);
        g.fillRect(75,725,350,145);
        g.fillRect(150,675,200,50);
    }
    public static void drawWheels(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(115,830,100,100);
        g.fillOval(275,830,100,100);
        g.setColor(Color.lightGray);
        g.drawOval(114,829,101,101);
        g.drawOval(113,828,102,102);
        g.drawOval(112,827,103,103);
        g.drawOval(274,829,101,101);
        g.drawOval(273,828,102,102);
        g.drawOval(272,827,103,103);
    }
    public static void drawWindows(Graphics g){
        g.setColor(Color.cyan);
        g.fillRect(310,740,85,30);
    }
}
