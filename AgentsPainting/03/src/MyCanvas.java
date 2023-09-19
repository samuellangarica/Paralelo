import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyCanvas extends Canvas implements MouseListener {

    private static Graphics gall;
    private static Color BACKGROUND_COLOR = Color.GRAY;

    public MyCanvas() {
        this.setBackground(BACKGROUND_COLOR);
        this.addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        gall = g.create();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        gall.setColor(Color.WHITE);
        gall.fillOval(e.getX(), e.getY(), 30, 30);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }
}
