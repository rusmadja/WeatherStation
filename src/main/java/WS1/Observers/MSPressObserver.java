package WS1.Observers;

public class MSPressObserver implements  Observer<Integer> {
    private MonitoringScreen monitoringScreen;

    public MSPressObserver(MonitoringScreen monitoringScreen) {
        System.out.println("MSPressObserver was created");
        this.monitoringScreen = monitoringScreen;
    }

    @Override
    public void Update(Integer data) {
        monitoringScreen.pressurePrint(data);
    }

    @Override
    public String getClassName() {
        return "MSPressObserver";
    }
}