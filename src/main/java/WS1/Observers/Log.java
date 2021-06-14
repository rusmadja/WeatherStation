package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;

public class Log {
    public Log(WeatherMonitoringSystem ws) {
        System.out.println("Log was created");
        ws.addPressureObserver(new LogPressObserver(this));
        ws.addPressureTrendObserver(new LogPressTrendObserver(this));
    }

    public void pressurePrint(int data) {
        System.out.println("Log: pressure = " + data + " millibars");
    }

    public void pressureTrendPrint(Trend data) {
        System.out.println("Log: pressure trend = " + data);
    }
}