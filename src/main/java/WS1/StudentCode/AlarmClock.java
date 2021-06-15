package WS1.StudentCode;

import WS1.Observables.AlarmClockRecord;
import WS1.Observables.AlarmListener;

import java.util.ArrayList;

public class AlarmClock
{
    public final int CLOCK_INTERVAL_MILLIS = 100;
    protected static AlarmClock instance = null;
    private ArrayList<AlarmClockRecord> itsAlarmClockRecords = new ArrayList();

    protected AlarmClock() {}
    public static AlarmClock theInstance()
    {
        if(null==instance)
            instance = new AlarmClock();
        return instance;
    }

    protected void tic(){
        for (AlarmClockRecord alarm :itsAlarmClockRecords){
            if(alarm.getIntervalDecrement() % alarm.getInterval() == 0 && alarm.getIntervalDecrement() != 0)
                alarm.getAlarmListener().WakeUp();
            alarm.intervalDecrement += CLOCK_INTERVAL_MILLIS;
        }
    }

    public void register(int interval, AlarmListener pal) {
        itsAlarmClockRecords.add(new AlarmClockRecord(interval,pal));
    }
}

