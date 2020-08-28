// ****************************************************************
//   Coords.java
//
//   Draw rectangles to illustrate the Java coordinate system
//
// ****************************************************************

import java.applet.Applet;
import java.awt.*;
import java.lang.Math;


public class Boxes extends Applet
{
    public void paint (Graphics page)
    {

		// Declare variables
		int x, y;    // x and y coordinates of upper left-corner of each shape
		int width, height; // width and height of each shape

		// Set the background color
		setBackground (Color.black);

		for(int i = 0 ; i < 100; i++)
		{

			page.setColor (Color.white);
			x = (int)(Math.random()*950);
			y = (int)(Math.random()*750);
			//System.out.println(x);

			width  = (int)(Math.random()*50);
			height = (int)(Math.random()*50);

			if(width < 5){
				page.setColor(Color.yellow);
				page.fillRect(x, y, width, height);
                           }
			if(height < 5){
				page.setColor(Color.green);
				page.fillRect(x, y, width, height);
                        }
			page.drawRect(x, y, width, height);
		}

		// Set the color for the next shape to be drawn





    }
}
