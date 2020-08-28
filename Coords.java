// ****************************************************************
//   Coords.java
//
//   Draw rectangles to illustrate the Java coordinate system
//          
// ****************************************************************

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Canvas;

public class Coords extends Canvas
{
    public Coords(int width, int height)
    {
        setSize(width, height);
        setVisible(true);
        setBackground(Color.WHITE);

    }  
    
    public void update(Graphics window)
    {
       paint(window);   
    }
    
    public void paint (Graphics page)
    {
	// Declare size constants
	final int PAGE_WIDTH = 1200;
	final int PAGE_HEIGHT = 900;

	// Declare variables
	int x, y;    // x and y coordinates of upper left-corner of each shape
	int width = 400; // width of each rectangle
	int height = 300; // height of each rectangle 

	// Set the background color
	setBackground (Color.yellow);

	// Set the color for the next shape to be drawn
	page.setColor (Color.blue);

	// Center Rectangle
	x = PAGE_WIDTH/2 - width/2;
	y = PAGE_HEIGHT/2 - height/2;
	page.fillRect(x, y, width, height);
	
	// Top Left Rectangle
	x = 0;
	y = 0;
	page.setColor (Color.cyan);
	page.fillRect(x, y, width, height);
	
	// Top Right Rectangle
	x = 2*width;
	y = 0;
	page.setColor (Color.magenta);
	page.fillRect(x, y, width, height);

	// Bottom Left Rectangle
	x = 0;
	y = 2*height;
	page.setColor (Color.white);
	page.fillRect(x, y, width, height);
	
	// Top Right Rectangle
	x = 2*width;
	y = 2*height;
	page.setColor (Color.green);
	page.fillRect(x, y, width, height);
	
    }
}
