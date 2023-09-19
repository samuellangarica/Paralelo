import javax.swing.JFrame;

public class Ventana extends JFrame {

    private static int WIDTH = 500;
    private static int HEIGHT = 500;

    public Ventana(String name){
        this.setTitle(name);
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyCanvas myCanvas = new MyCanvas();
        this.add(myCanvas);
        this.setVisible(true);
    }
    
}
