package WS1.Observables;

import WS1.Observers.Observer;

import java.util.Random;

public class Nimbus1PressureSensor extends Observable<Integer> {

    public Random random;

    public Nimbus1PressureSensor(String str, int data) {
        random = new Random();
    }

    public Integer read() {
        return random.nextInt(1050 - 950) + 950;
    }


}
