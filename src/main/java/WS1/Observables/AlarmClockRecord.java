package WS1.Observables;

public class AlarmClockRecord {

    private int interval;
    public int intervalDecrement;
    private AlarmListener alarmListener ;

    public AlarmClockRecord(int interval, AlarmListener alarmListener){
        this.interval=interval;
        this.alarmListener=alarmListener;
        intervalDecrement=0;
    }
    public int getInterval() {
        return interval;
    }
    public int getIntervalDecrement() {
        return intervalDecrement;
    }
    public AlarmListener getAlarmListener() {
        return alarmListener;
    }
}

