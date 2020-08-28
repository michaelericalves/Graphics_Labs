//Name - 
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

public class FaceRunner extends JFrame
{
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 800;

	public FaceRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new Face(WIDTH, HEIGHT));
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		FaceRunner run = new FaceRunner();
	}
}