package WS1.Observables;

import WS1.Observers.Observer;
import WS1.Observers.Trend;

import java.util.ArrayList;
import java.util.List;

public class PressureTrendSensor extends Observable<Trend> implements Observer<Integer>{

    /*index 0 le plus ancien */
    private List<Integer> readingList = new ArrayList<>(3);
    Trend pressureState;
    Trend lastState;
    //int lastCalc;

    public PressureTrendSensor( Nimbus1PressureSensor pressureSensor) {
        pressureSensor.addObserver(this);
        for (int i =0 ; i<3 ; i++)
            readingList.set(i,0);
    }

    public Trend calc(){
        if (readingList.get(0) != 0)
        {
            if (readingList.get(0) < readingList.get(1) && readingList.get(1) < readingList.get(2))
                return Trend.RISING;
            else {
                if (readingList.get(0) > readingList.get(1) && readingList.get(1) > readingList.get(2))
                    return Trend.FALLING;
            }
            return Trend.STABLE;
        }
        else return null;
    }

    public void check(int data) {
        readingList.set(0,readingList.get(1));
        readingList.set(1,readingList.get(2));
        readingList.set(2, data);
        lastState=calc();
        if (lastState !=pressureState)
            notifyObservers(lastState);
    }

    @Override
    public void Update(Integer Data) {
        check(Data);
    }

    @Override
    public String getClassName() {
        return "PressureTrendSensor";
    }

}
