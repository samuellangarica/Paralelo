package ObjetosCompartidos;

public class Hilo extends Thread {
    private DataCenter dataCenter;

    public Hilo(DataCenter dataCenter, String name) {
        super(name);
        this.dataCenter = dataCenter;
    }

    @Override
    public void run() {
        int c = 0;
        while (c < 1000) {
            if (dataCenter.tryToIncrement()) c++;
        }
        System.out.println(this.getName() + " finished at " + Integer.toString(dataCenter.getValue()));
    }
}
