// ****************************************************************
//   Face.java
//
//   Draw a face - refer to lab document for details
//
// ****************************************************************

import java.applet.Applet;
import java.awt.*;

public class Bullseye extends Applet
{
    public void paint (Graphics page)
    {

		// Declare variables
		int x = 300;
		int y = 200;

		// Set the background color
		setBackground(Color.cyan);
		page.setColor(Color.black);

		for (int diameter = 300; diameter > 50; diameter -= 50)
		{
			page.fillOval(x, y, diameter, diameter);

			if(page.getColor() == Color.black)
				page.setColor(Color.white);
			else
				page.setColor(Color.black);

			x += 25;
			y += 25;

		}
		page.setColor(Color.red);
		page.fillOval(x,y,50,50);

    }
}
