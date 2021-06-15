package WS1.Observables;


import WS1.Observers.Observer;
import WS1.StudentCode.AlarmClock;
import WS1.StudentCode.Nimbus1Clock;
/*@Singleton*/
public class WeatherMonitoringSystem {
    public Nimbus1TemperatureSensor nimbus1TemperatureSensor;
    public Nimbus1PressureSensor nimbus1PressureSensor;
    public PressureTrendSensor pressureTrendSensor;
    private static WeatherMonitoringSystem instance = null;

    public static WeatherMonitoringSystem theInstance() {
        if (instance == null) {
            instance = new WeatherMonitoringSystem();
        }
        return instance;
    }

    private WeatherMonitoringSystem() {
        System.out.println("WeatherMonitoringSystem was created");
        AlarmClock alarmClock = Nimbus1Clock.theInstance();

        nimbus1PressureSensor = new Nimbus1PressureSensor("pressure",1100);
        nimbus1TemperatureSensor = new Nimbus1TemperatureSensor("temperature",700);
        pressureTrendSensor = new PressureTrendSensor(nimbus1PressureSensor);
    }

    public void addPressureObserver(Observer observer) {
        nimbus1PressureSensor.addObserver(observer);
        System.out.println(observer.getClassName()+" observes pressure");
    }
    public void addTemperatureObserver(Observer observer) {
        nimbus1TemperatureSensor.addObserver(observer);
        System.out.println(observer.getClassName()+" observes temperature");
    }
    public void addPressureTrendObserver(Observer observer) {
        pressureTrendSensor.addObserver(observer);
        System.out.println(observer.getClassName()+" observes pressure trend");
    }
}