package WS1.Observables;

public abstract class Sensor<T> extends Observable<T> {
    private T lastReading ;
    private int data;
    private String type;

    public Sensor(String type, int data){
        this.type = type;
        this.data = data;
        System.out.println( this.type + " registered to clock");
    }


    public abstract T read();

    public void check(){
        T temp = read();
        if(temp != lastReading){
            lastReading = temp;
            notifyObservers(temp);
        }
        else
            lastReading = temp;
    }

}
