/*
Name -
Date -
Class -
Lab  -
THIS FILE WAS UPDATED ON 2/28/20
*/

import javax.swing.JFrame;

public class AlienRunner extends JFrame
{
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 800;
    public static String line;
    public AlienRunner()
    {
        super("Graphics Runner");
        setSize(WIDTH,HEIGHT);

        getContentPane().add(new Alien(WIDTH, HEIGHT));

        setVisible(true);
    }

    public static void main( String args[] )
    {
        AlienRunner run = new AlienRunner();

    }
}