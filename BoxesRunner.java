//Name - 
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

public class BoxesRunner extends JFrame
{
	private static final int WIDTH = 1200;
	private static final int HEIGHT = 900;
	public BoxesRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new Boxes());
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		BoxesRunner run = new BoxesRunner();
	}
}