package WS1.Observables;

import WS1.StudentCode.AlarmClock;
import WS1.StudentCode.RandomSupplier;

public class Nimbus1TemperatureSensor extends Sensor<Integer> {
    RandomSupplier random;
    public Nimbus1TemperatureSensor(String type, int data) {
        super(type, data);
        random = new RandomSupplier();
        AlarmClock.theInstance().register(data,new SensorAlarmListener(this));
    }

    @Override
    public Integer read() {
        return random.getRnd().nextInt(40);
    }

}
