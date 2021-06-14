package WS1.Observables;

import WS1.Observers.Observer;

import java.util.ArrayList;
import java.util.List;


public interface Observable<T> {
    List<Observer> itsObservers = new ArrayList<>();

    default void notifyObservers(T data){
        for (Observer observer : itsObservers)
            observer.Update(data);
    }

    default void  addObserver(Observer observer){
        itsObservers.add(observer);
       /* String className = observer.getClassName();
        if (className != "PressureTrendSensor")
        {
            System.out.println(className + "observes ");
            switch(className){
                case "LogPressObserver":
                    System.out.println("pressures trend ");
                    break;
                case "LogPressTrendObserver":
                    System.out.println("pressure ");
                    break;
            }
        }*/
    }
}

