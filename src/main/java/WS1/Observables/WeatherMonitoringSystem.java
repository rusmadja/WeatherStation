package WS1.Observables;


public class WeatherMonitoringSystem  {
    private static WeatherMonitoringSystem instance;

    public Nimbus1TemperatureSensor nimbusTemperator;
    public Nimbus1PressureSensor nimbus1PressureSensor;
    public PressureTrendSensor pressureTrendSensor;

    public static WeatherMonitoringSystem theInstance() {
        return null;
    }


    public void addPressureObserver(){
    }

    public  void addPressureTrendObserver(){
    }

    public  void addTemperatureObserver(){
    }

    private WeatherMonitoringSystem(){

    }

}
