package WS1.Observers;

public class MSTempObserver implements Observer<Integer>{
    private MonitoringScreen ms;

    public MSTempObserver (MonitoringScreen monitoringScreen){
        System.out.println("MSPressObserver was created");
        this.ms = monitoringScreen;
    }


    @Override
    public void Update(Integer data) {
        ms.pressurePrint(data);
    }

    @Override
    public String getClassName() {
        return "MSTempObserver";
    }
}

