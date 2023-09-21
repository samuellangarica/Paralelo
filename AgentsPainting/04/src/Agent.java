import java.awt.*;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Agent implements Runnable{
    Graphics gall;
    private static final int RADIUS = 30;

    public int x,y;
    JLabel label;
    

    public Agent(int x, int y, Graphics g){
        this.gall = g.create();
        this.x = x;
        this.y = y;

        label = new JLabel("hola");
        

        drawCircle(Color.WHITE);
    }
    private void drawCircle(Color color){
        this.gall.setColor(color);
        this.gall.fillOval(this.x, this.y, RADIUS, RADIUS);
    }

    @Override
    public void run(){
        
        while(true){

            executeMovement();

            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
            }
            
        }
    }

    private void executeMovement(){
        drawCircle(Color.WHITE);

        int min = -10;
        int max = 10;

        int xMovement = (int) (Math.random() * (max - min) + min);
        int yMovement = (int) (Math.random() * (max - min) + min);
        
        this.x += xMovement;
        this.y += yMovement;

        drawCircle(Color.BLACK);

    }

}