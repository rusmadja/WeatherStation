package WS1.Observers;

public class MSPressObserver implements Observer<Integer>{
    @Override
    public void Update(Integer Data) {

    }

    @Override
    public String getClassName() {
        return "MSPressObserver";
    }

    public MSPressObserver(MonitoringScreen aMS){
    }
}
