package WS1.Observables;

public abstract class Sensor<T> extends Observable<T> {
    private T lastReading ;
    private T data;
    private String type;

    public abstract T read();

    public Sensor(String type, T data){
        this.type = type;
        this.data = data;
        System.out.println( this.type + " registered to clock");
    }

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
