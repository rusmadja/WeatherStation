package WS1.Observables;

import WS1.Observers.Observer;

public abstract class Sensor<T> implements Observable<T> {
    T lastReading;
    public Sensor(String str, int data) {
    }

    public abstract T read();

    public void check(){
        T temp = read();
        if(temp != lastReading){
            lastReading = temp;
            notifyObservers(temp);
        }
    }

}
