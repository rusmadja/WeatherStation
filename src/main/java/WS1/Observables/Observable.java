package WS1.Observables;

import WS1.Observers.Observer;

import java.util.ArrayList;
import java.util.List;


public class Observable<T> {
    List<Observer> itsObservers = new ArrayList<>();

    public void notifyObservers(T data){
        for (Observer observer : itsObservers)
            observer.Update(data);
    }

    public void  addObserver(Observer observer){
        itsObservers.add(observer);
    }
}

