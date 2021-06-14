package WS1.Observables;

import WS1.Observers.Observer;



public interface Observable {
    List<Observer> itsObservers = null;
    void notifyObservers(int data);

    public void  addObserver(Observer<T> observer);
}
