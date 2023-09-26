import java.awt.BorderLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Ventana extends JFrame {

    private static int WIDTH = 400;
    private static int HEIGHT = 400;

    public Ventana(String name){
        this.setTitle(name);
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField textField = new JTextField("0");
        MyCanvas myCanvas = new MyCanvas();
        myCanvas.setTextField(textField);
        
        

        this.add(myCanvas);
        this.add(textField, BorderLayout.NORTH);

        this.setVisible(true);
    }

    
    
}
