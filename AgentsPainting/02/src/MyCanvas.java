import java.awt.*;

public class MyCanvas extends Canvas {

    private static Graphics gall;
    private static Color BACKGROUND_COLOR = Color.GRAY;

    public MyCanvas(){
        this.setBackground(BACKGROUND_COLOR);
    }

    @Override
    public void paint(Graphics g){
        gall = g.create();
        gall.setColor(Color.WHITE);
            g.fillOval(200, 200, 30 ,30);
    }
}
