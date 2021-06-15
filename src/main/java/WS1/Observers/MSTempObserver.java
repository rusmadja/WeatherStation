package WS1.Observers;

public class MSTempObserver implements Observer<Integer>{
    private MonitoringScreen monitoringScreen;

    public MSTempObserver (MonitoringScreen monitoringScreen){
        System.out.println("MSTempObserver was created");
        this.monitoringScreen = monitoringScreen;
    }


    @Override
    public void Update(Integer data) {
        monitoringScreen.temperaturePrint(data);
    }

    @Override
    public String getClassName() {
        return "MSTempObserver";
    }
}

