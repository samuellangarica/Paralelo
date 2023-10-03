import ObjetosCompartidos.DataCenter;
import ObjetosCompartidos.Hilo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DataCenter dataCenter = new DataCenter();
        Hilo[] hilos = new Hilo[5];
        System.out.println("Valor al comenzar: " + dataCenter.getValue());

        for (int i = 0; i < 5; i++){
            hilos[i] = new Hilo(dataCenter, "Thread"+Integer.toString(i));
            hilos[i].start();
        }

        for (int i = 0; i < 5; i++){
            try{
                hilos[i].join();
            }catch(InterruptedException ie){
                System.out.println("Thread" + Integer.toString(i) + "was interrupted");
            }
        }

        System.out.println("Valor al terminar: " + dataCenter.getValue());


    }
}