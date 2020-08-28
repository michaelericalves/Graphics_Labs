
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Canvas;
import java.lang.Math;
import java.awt.Font;
import java.util.Scanner;


public class Alien extends Canvas
{
    public Alien(int width, int height)
    {
        setSize(width, height);
        setVisible(true);
        setBackground(new Color(225, 247, 230));;

    }

    public void update(Graphics page)
    {
        paint(page);
    }

    public void paint (Graphics page)
    {
        // Declare size constants
        final int MAX_SIZE = 300;
        final int page_WIDTH = 1000;
        final int page_HEIGHT = 800;
        int fontSize = 200;
        page.setFont(new Font("TimesRoman", Font.ITALIC, fontSize));


        drawFlours(page);
        drawBigMountains(page);
        drawMountains(page);
        drawGround(page);
        drawStars(page);
        drawMoon(page);
        drawFace(page);
        drawBody(page);
        drawRightArm(page);
        drawLeftLeg(page);
        drawRightLeg(page);
        drawLeftArm(page);
        drawShip(page);
        //drawText(page);



        // Declare variables



        // Set the background color

        // Set the color for the shape to be drawn

        // Draw your first shape

        // continue setting colors and drawing shapes...


    }

    public void drawFace(Graphics page)
    {
        //draws head
        page.setColor(new Color(220, 220, 205));//gray skin tone
        page.fillRect(350,200,300,150);
        page.setColor(Color.red);
        page.fillRect(450,320,100,15);
        page.setColor(Color.black);
        for (int i =0; i<100 ; i+=3){

            page.drawLine(450+i,320,450+i,335);

        }
        page.setColor(Color.black);
        for (int i =0; i<=14 ; i+=2){

            page.drawRect(350+(i/2),200+(i/2),300-i,150-i);

        }

        //draws left eye
        page.setColor(Color.red);
        page.drawOval(400, 275,75, 40);
        for (int i =0; i<=8 ; i+=2){

            page.drawOval(400+(i/2),275+(i/2),75-i,40-i);

        }
        page.setColor(Color.blue);
        page.fillOval(404,279,67,32);
        page.setColor(Color.yellow);
        page.fillOval(420,278,34,34);

        //draws right eye
        page.setColor(Color.red);
        page.drawOval(525, 275,75, 40);
        for (int i =0; i<=8 ; i+=2){

            page.drawOval(525+(i/2),275+(i/2),75-i,40-i);

        }
        page.setColor(Color.blue);
        page.fillOval(529,279,67,32);
        page.setColor(Color.yellow);
        page.fillOval(547,278,34,34);

        //draws middle eye
        page.setColor(Color.red);
        page.drawOval(460, 225,75, 40);
        for (int i =0; i<=8 ; i+=2){

            page.drawOval(460+(i/2),225+(i/2),75-i,40-i);

        }
        page.setColor(Color.blue);
        page.fillOval(465,229,67,32);
        page.setColor(Color.yellow);
        page.fillOval(482,228,34,34);
    }
    public void drawMountains(Graphics page){
        final int page_WIDTH = 1000;
        final int page_HEIGHT = 800;
        page.setColor(new Color(123, 66, 245));
        int y = 100, y2 =0;

        for (int i =0; i<=page_WIDTH; i++)
        {
            y2 = (int)(Math.random()*3)+1;

            if (y2==1){
                y++;
            }
            else if (y2==2){
                y--;
            }


            if (y>=100)
            {
                y=100;
            }


            page.drawLine(i,y,i,y);
            page.drawLine(i,y+1,i,y+1);
            page.drawLine(i,y+2,i,y+2);
        }



    }
    public void drawGround(Graphics page){
        final int page_WIDTH = 1000;
        final int page_HEIGHT = 800;

        int y = 500, y2 =0;

        for (int i =0; i<=page_WIDTH; i++)
        {
            y2 = (int)(Math.random()*3)+1;

            if (y2==1){
                y++;
            }
            else if (y2==2){
                y--;
            }


            if (y<=500)
            {
                y=500;
            }
            page.setColor(Color.black);
            page.drawLine(i,y,i,y);
            page.drawLine(i,y+1,i,y+1);
            page.drawLine(i,y+2,i,y+2);
            page.setColor(new Color(211, 235, 52));
            page.drawLine(i,y+150,i,y+150);
            page.drawLine(i,y+151,i,y+151);
            page.drawLine(i,y+152,i,y+152);



        }

    }
    public void drawStars(Graphics page){

        final int page_WIDTH = 1000;
        final int page_HEIGHT = 800;

        for (int i =1; i<=100; i++)
        {
            int xRand = (int)(Math.random()*page_WIDTH)+1;
            int yRand  = (int)(Math.random()*75)+1;
            int x2 = xRand;
            int y2 = yRand;
            page.setColor(new Color(123, 66, 245));
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2+=15,y2+=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2-=15,y2+=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2+=15,y2-=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2-=15,y2-=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2,y2-=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2-=15,y2);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2,y2+=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2+=15,y2);
            x2 = xRand; y2 =yRand;
        }
        for (int i =1; i<=100; i++)
        {
            int xRand = (int)(Math.random()*page_WIDTH)+1;
            int yRand  = (int)(Math.random()*75)+1;
            int x2 = xRand;
            int y2 = yRand;
            page.setColor(Color.yellow);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2+=15,y2+=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2-=15,y2+=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2+=15,y2-=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2-=15,y2-=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2,y2-=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2-=15,y2);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2,y2+=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2+=15,y2);
            x2 = xRand; y2 =yRand;
        }
        for (int i =1; i<=100; i++)
        {
            int xRand = (int)(Math.random()*page_WIDTH)+1;
            int yRand  = (int)(Math.random()*75)+1;
            int x2 = xRand;
            int y2 = yRand;
            page.setColor(Color.green);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2+=15,y2+=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2-=15,y2+=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2+=15,y2-=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2-=15,y2-=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2,y2-=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2-=15,y2);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2,y2+=15);
            x2 = xRand; y2 =yRand;
            page.drawLine(x2, y2, x2+=15,y2);
            x2 = xRand; y2 =yRand;
        }
    }
    public void drawMoon(Graphics page){
        page.setColor(new Color(245, 66, 129));
        page.fillOval(100,30,115,115);
        page.setColor(Color.green);
        for (int i =100; i<200; i++){
            int xRand = (int)(Math.random()*100)+100;
            int yRand  = (int)(Math.random()*100)+30;
            page.drawOval(xRand,yRand,5,5);

        }
        page.setColor(Color.black);
        for (int i =100; i<150; i++){
            int xRand = (int)(Math.random()*90)+115;
            int yRand  = (int)(Math.random()*90)+25;
            page.drawOval(xRand,yRand,10,10);

        }
    }
    public void drawBody(Graphics page){
        page.setColor(new Color(220, 220, 205));//gray skin tone
        page.fillRect(400,350,200,250);
        page.setColor(Color.black);
        for (int i =0; i<=14 ; i+=2){

            page.drawRect(400+(i/2),350 + (i/2),200-i,250-i);


        }
        page.setColor(Color.black);
        int y =0;
        for (int x =400; x<575 ; x+=10){

            for (int i =350; i<590 ; i+=15){
                page.drawOval(x, y+i,25,25);
            }
        }
    }
    public void drawLeftArm (Graphics page){
        page.setColor(Color.black);
        page.fillRect(600, 400, 100, 50);
        page.fillRect(700, 400, 50, 100);
        page.setColor(Color.red);
        page.fillOval(700, 475, 50, 50);
        for (int i =0; i<=10; i+=2)
        {
            page.drawLine(725, 515, 730+(i*15), 560);
            page.drawLine(725, 515, 730-(i*15), 560);
            page.drawLine(725, 515, 730+(i*15)-1, 560);
            page.drawLine(725, 515, 730-(i*15)-1, 560);
            page.drawLine(725, 515, 730+(i*15)-2, 560);
            page.drawLine(725, 515, 730-(i*15)-2, 560);
        }
    }
    public void drawRightArm (Graphics page){
        page.setColor(Color.black);
        page.fillRect(300, 400, 100, 50);
        page.fillRect(250, 350, 50, 100);
        page.setColor(Color.red);
        page.fillOval(250, 325, 50, 50);

    }
    public void drawLeftLeg (Graphics page){
        page.setColor(Color.black);
        page.fillRect(600, 650, 100, 50);
        page.fillRect(600, 550, 50, 100);
        page.setColor(Color.red);
        page.fillOval(600, 600, 50, 50);
    }
    public void drawRightLeg (Graphics page){
        page.setColor(Color.black);
        page.fillRect(300, 650, 100, 50);
        page.fillRect(350, 550, 50, 100);
        page.setColor(Color.red);
        page.fillOval(350, 600, 50, 50);
    }
    public void drawBigMountains(Graphics page){
        page.setColor(Color.yellow);
        for (int i =0; i<=25; i+=4)
        {
            page.setColor(new Color (52, 235, 207));
            page.drawLine(200, 200, (200+(i*15)), 515);
            page.drawLine(200, 200, (200-(i*15)), 515);
            page.drawLine(200, 200, (200+(i*15-1)), 515);
            page.drawLine(200, 200, (200-(i*15-1)), 515);
            page.drawLine(200, 200, (200+(i*15-2)), 515);
            page.drawLine(200, 200, (200-(i*15-2)), 515);
            page.drawLine(200, 200, (200+(i*15-3)), 515);
            page.drawLine(200, 200, (200-(i*15-3)), 515);
            page.drawLine(200, 200, (200+(i*15-4)), 515);
            page.drawLine(200, 200, (200-(i*15-4)), 515);


        }
    }
    public void drawFlours(Graphics page){
        final int page_WIDTH = 1000;
        final int page_HEIGHT = 800;

        int x,y =0,rand;
        page.setColor(Color.green);
        for (int i =0; i<=page_WIDTH; i+=15)
        {

            rand = (int)(Math.random()*2)+1;
            x = (int)(Math.random()*15)+1;
            if (rand==1){
                y+=10;
            }
            else if (rand==2){
                y-=10;
            }


            if (y<=600)
            {
                y=600;
            }

            if (page.getColor() == Color.green){
                page.setColor(new Color(109, 50, 168));
            }
            else{
                page.setColor(Color.green);
            }
            page.fillOval(i+x,y,15,15);



        }
    }
    public void drawShip(Graphics page){
        page.setColor(Color.yellow);
        page.fillOval(750,115,55,65);
        page.setColor(Color.black);
        for (int i = 0; i <10; i+=2)
        {
            page.drawOval(750+i,115+i,55-i,65-i);
        }
        page.setColor(new Color(220, 220, 205));
        page.fillOval(700,150,150,50);
        page.setColor(Color.black);
        for (int i = 0; i <150; i+=10)
        {
            page.drawOval(700+i,170,5,5);
        }
    }
    public String text(){
        Scanner input = new Scanner(System.in);
        System.out.println("What should I say?");
        String line = input.nextLine();
        return(line);
    }
    public void drawText(Graphics page){
        String words = text();
        page.drawString(words, 700, 500);
    }
}