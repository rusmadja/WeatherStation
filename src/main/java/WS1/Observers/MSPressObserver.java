package WS1.Observers;

public class MSPressObserver implements  Observer<Integer> {
    private MonitoringScreen ms;

    public MSPressObserver(MonitoringScreen monitoringScreen) {
        System.out.println("MSPressObserver was created");
        this.ms = monitoringScreen;
    }

    @Override
    public void Update(Integer data) {
        ms.pressurePrint(data);
    }

    @Override
    public String getClassName() {
        return "MSPressObserver";
    }
}