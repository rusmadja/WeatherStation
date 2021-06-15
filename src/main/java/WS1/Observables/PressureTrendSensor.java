package WS1.Observables;

import WS1.Observers.Observer;
import WS1.Observers.Trend;

import java.util.ArrayList;
import java.util.List;

public class PressureTrendSensor extends Observable<Trend> implements Observer<Integer> {
    final static private int NUM_OF_ELEMENTS = 3;
    /*index 0 le plus ancien */
    private List<Integer> readingList = new ArrayList<>();
    Trend pressureState;
    Trend lastState;

    public PressureTrendSensor(Nimbus1PressureSensor pressureSensor) {
        pressureSensor.addObserver(this);
        for (int i = 0; i < NUM_OF_ELEMENTS; i++)
            readingList.add(0);
    }

    public Trend calc() {
        if (readingList.get(0)!=0) {

            Boolean falling = true, rising = true;
            for (int i = 0; i < NUM_OF_ELEMENTS - 1; i++) {
                if (readingList.get(i) < readingList.get(i + 1))
                    falling = false;
                if (readingList.get(i) < readingList.get(i + 1))
                    rising = false;
            }
            if (falling && !rising)
                return Trend.FALLING;
            if (!falling && rising)
                return Trend.RISING;
            return Trend.STABLE;
        }
        return null;
    }

    public void check(int data) {
        for (int i = 0; i < NUM_OF_ELEMENTS-1; i++) {
            readingList.set(i, readingList.get(i+1));
        }
        readingList.set(NUM_OF_ELEMENTS-1, data);
        lastState = calc();
        if (lastState != pressureState)
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
