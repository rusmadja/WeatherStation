package WS1;

import WS1.Observables.Nimbus1PressureSensor;
import WS1.Observables.Nimbus1TemepratureSensor;
import WS1.Observables.PressureTrendSensor;

public class WeatherMonitoringSystem {
    private static WeatherMonitoringSystem instance;

    public Nimbus1TemepratureSensor nimbusTemperator;
    public Nimbus1PressureSensor nimbus1PressureSensor;
    public PressureTrendSensor pressureTrendSensor;


    public void addPressureObserver(){
    }

    public  void addPressureTrendObserver(){
    }

    public  void addTemperatureObserver(){
    }




    private WeatherMonitoringSystem(){

    }

}
