package ObjetosCompartidos;


public class DataCenter {
    private int value;
    private boolean isBeingUsed = false;
    public DataCenter(){
    }
    public boolean tryToIncrement(){
        if (!isBeingUsed){
            isBeingUsed = true;
            value++;
            isBeingUsed = false;
            return true;
        }
        return false;
    }
    public int getValue() {
        return value;
    }

}
