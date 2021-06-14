package WS1.Observables;

public class AlarmClockRecord {
    int interval;
    int intervalDecrement;
    private AlarmListener pAlarmListener ;



    public AlarmClockRecord(int aInterval, AlarmListener alarmListener){
        interval=aInterval;
        pAlarmListener=alarmListener;
        intervalDecrement=0;
    }

    public int getIntervalDecrement(){
        return intervalDecrement;
    }

    public AlarmListener getListener(){
        return pAlarmListener;
    }
    public void setIntervalDecrement(int interval){
        intervalDecrement=interval;
    }
    public int getinterval(){
        return interval;
    }
}

