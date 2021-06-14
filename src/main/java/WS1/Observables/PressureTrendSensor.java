package WS1.Observables;

import WS1.Observers.Observer;
import WS1.Observers.Trend;

import java.util.ArrayList;
import java.util.List;

public class PressureTrendSensor extends Sensor<Trend> implements Observer<Integer>{

    List<Integer> readingList = new ArrayList<>(3);

    public PressureTrendSensor( String str, int data,Nimbus1PressureSensor presssureSensor) {
        super(str, data);
        presssureSensor.addObserver(this);
    }

    @Override
    public void Update(Integer Data) {
        super.check();
    }

    @Override
    public String getClassName() {
        return "PressureTrendSensor";
    }

    @Override
    public Trend read() {
       return Trend.GoDown;
    }
}
/*
int lastCalc;
    int lastReading1;
    int lastReading2;
    int lastReading3;
    Trend pressureState;
    Trend LastState;

    public PressureTrendSensor( Nimbus1PressureSensor presssureSensor) {
        presssureSensor.addObserver(this);
    }




    public  Trend calcTrend(){
        if (lastReading1 !=0)
        {
            if (lastReading2 > lastReading1 && lastReading3 > lastReading2)
                return Trend.RISING;
            else {
                if (lastReading1 > lastReading2 && lastReading2 >= lastReading3)
                    return Trend.FALLING;
            }
            return Trend.STABLE;
        }
        else return null;
    }

    public void check(int data){
            lastReading1=lastReading2;
            lastReading2=lastReading3;
            lastReading3=data;
            LastState=calcTrend();
            if (LastState !=pressureState)
                notifyObserver(LastState);

    }




    @Override
    public void update(Integer d) {
        check(d);
    }

    @Override
    public String getName() {
        return "PressureTrendSensor ";
    }
 */