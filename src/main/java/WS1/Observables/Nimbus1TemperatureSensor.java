package WS1.Observables;

import WS1.Observers.Observer;
import WS1.StudentCode.RandomSupplier;

import java.util.Random;

public class Nimbus1TemperatureSensor extends Observable<Integer> {
    RandomSupplier random;
    /**int lastReading = 0;*/
    public Nimbus1TemperatureSensor(String str, int data) {
        random = new RandomSupplier();
    }

    public Integer read() {
        return random.getRnd().nextInt(40)+1;
    }

}
