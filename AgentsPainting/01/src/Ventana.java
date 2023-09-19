import javax.swing.JFrame;

public class Ventana extends JFrame {

    int WIDTH = 300;
    int HEIGHT = 300;

    public Ventana(String name){
        this.setTitle(name);
        this.setSize(WIDTH, HEIGHT);
        this.setVisible(true);
    }

}
