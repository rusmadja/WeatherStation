package WS1.Observables;

import WS1.Observers.Observer;

import java.util.List;

public interface Observable {
    List<Observer> itsObservers = null;
    void notifyObservers(int data);
}
