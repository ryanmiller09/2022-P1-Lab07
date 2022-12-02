package FinalPic;

import java.awt.*;
import java.applet.*;

public class Road extends Applet{

    public void paint(Graphics g){

        Background.drawSky(g);
        Background.drawStreet(g);
        Background.drawLines(g);


    }
}
