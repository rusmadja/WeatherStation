package WS1.Observables;

import WS1.Observers.Observer;

public abstract class Sensor<T> extends Observable<T> {
    T lastReading;
    public Sensor(String str, int data) {
    }

    public abstract T read();

    public abstract void check(int data);
    /*{
        T temp = read();
        if(temp != lastReading){
            lastReading = temp;
            notifyObservers(temp);
        }
    }*/

}
