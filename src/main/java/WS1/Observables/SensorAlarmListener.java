package WS1.Observables;

public class SensorAlarmListener extends AlarmListener{
    private Sensor sensor;

    public SensorAlarmListener(Sensor sensor) {
        this.sensor = sensor;
    }

    public void WakeUp() { sensor.check();}
}
