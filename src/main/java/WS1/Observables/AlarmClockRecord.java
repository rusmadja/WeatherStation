package WS1.Observables;

public class AlarmClockRecord {
    int interval;
    int intervalDecrement;
    private AlarmListener alarmListener ;

    public AlarmClockRecord(int interval, AlarmListener alarmListener){
        this.interval=interval;
        this.alarmListener=alarmListener;
        intervalDecrement=0;
    }

    /*public int getIntervalDecrement(){
        return intervalDecrement;
    }
    public AlarmListener getListener(){
        return alarmListener;
    }
    public void setIntervalDecrement(int interval){
        intervalDecrement=interval;
    }
    public int getinterval(){
        return interval;
    }*/
}

