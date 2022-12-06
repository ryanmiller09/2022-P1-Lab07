package FinalPic;

import java.awt.*;
import java.applet.*;

public class Road extends Applet{

    public void paint(Graphics g){

        Background.drawSky(g);
        Background.drawStreet(g);
        Background.drawLines(g);
        Background.drawSun(g);

        Bus.drawFrame(g);
        Bus.drawWheels(g);
        Bus.drawWindows(g);

        Car.drawBody(g);
        Car.drawWheels(g);
        Car.drawWindows(g);


    }
}
