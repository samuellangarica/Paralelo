import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JLabel;

public class MyCanvas extends Canvas implements MouseListener {


    private static Graphics gall;
    private static Color BACKGROUND_COLOR = Color.GRAY;

    private static final int CIRCLE_RADIUS = 30;

    ArrayList<Agent> agents = new ArrayList<Agent>();
    ArrayList<Thread> threads = new ArrayList<Thread>();

    int idCount = 0;

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

        Agent agent = new Agent(e.getX() - CIRCLE_RADIUS/2, e.getY() - CIRCLE_RADIUS/2, gall);
        Thread agentThread = new Thread(agent);
        agentThread.start();

        this.agents.add(agent);
        this.threads.add(agentThread);

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
