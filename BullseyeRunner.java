//Name - 
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

public class BullseyeRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public BullseyeRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new Bullseye());
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		BullseyeRunner run = new BullseyeRunner();
	}
}