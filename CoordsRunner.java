//Name - 
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

public class CoordsRunner extends JFrame
{
	private static final int WIDTH = 1200;
	private static final int HEIGHT = 900;

	public CoordsRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new Coords(WIDTH, HEIGHT));
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		CoordsRunner run = new CoordsRunner();
	}
}