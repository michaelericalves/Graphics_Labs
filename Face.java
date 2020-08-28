// ****************************************************************
//   Face.java
//
//   Draw a face - refer to lab document for details
//
// ****************************************************************

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Canvas;

public class Face extends Canvas
{
    public Face(int width, int height)
    {
        setSize(width, height);
        setVisible(true);
        setBackground(new Color(205, 247, 230));

    }  
    
    public void update(Graphics window)
    {
       paint(window);   
    }    
    
    public void paint (Graphics page)
    {
    // Declare size constants
    final int MAX_SIZE = 300;
    final int PAGE_WIDTH = 1000;
    final int PAGE_HEIGHT = 800;
    
    //draws head
    page.setColor(new Color(255, 229, 204));//skin tone
    page.fillOval(350,150,300,400);
    page.setColor(Color.black);
    for (int i =0; i<=14 ; i+=2){
        
        page.drawOval(350+(i/2),150+(i/2),300-i,400-i);
        
       }
    
    //draws left eye
    page.drawOval(400, 275,75, 40);
    for (int i =0; i<=8 ; i+=2){
        
        page.drawOval(400+(i/2),275+(i/2),75-i,40-i);
        
       }
    page.setColor(Color.white);
    page.fillOval(404,279,67,32);
    page.setColor(new Color(128, 84, 61));//brown
    page.fillOval(420,278,34,34);
    
    //draws right eye
    page.setColor(Color.black);
    page.drawOval(525, 275,75, 40);
    for (int i =0; i<=8 ; i+=2){
        
        page.drawOval(525+(i/2),275+(i/2),75-i,40-i);
        
       }
    page.setColor(Color.white);
    page.fillOval(529,279,67,32);
    page.setColor(new Color(128, 84, 61));//brown
    page.fillOval(547,278,34,34);
    
    
        //draws nose
        page.setColor(Color.black);
        page.drawOval((PAGE_WIDTH-70)/2,350,70,70);
        for (int i =0; i<=8 ; i+=2){
        
        page.drawOval(((PAGE_WIDTH-70)/2)+(i/2),350+i/2,70-i,70-i);
        
       }
    //right nostril
     page.drawOval((PAGE_WIDTH-70-35)/2,350+40,35,35);
     for (int i =0; i<=8 ; i+=2){
        
        page.drawOval(((PAGE_WIDTH-70-35)/2)+(i/2),350+40+i/2,35-i,35-i);
        
       }

    

    //left nostril
    
   page.drawOval((PAGE_WIDTH+40)/2,350+40,35,35);
   for (int i =0; i<=8 ; i+=2){
        
                page.drawOval(((PAGE_WIDTH+40)/2)+(i/2),350+40+i/2,35-i,35-i);
        
       }
    
     //draw mouth
     
     page.setColor(Color.red);
     page.fillOval((PAGE_WIDTH-125)/2,(PAGE_HEIGHT/2)+50, 125, 40);
     page.setColor(Color.white);
     page.fillOval((PAGE_WIDTH-100)/2,(PAGE_HEIGHT/2)+60, 100, 20);
     
    
     
     

    }
}
