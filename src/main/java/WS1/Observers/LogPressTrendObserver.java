package WS1.Observers;

public class LogPressTrendObserver implements Observer<Trend>{
    private Log itsLog;
    public LogPressTrendObserver(Log aLog){
        System.out.println("LogPressTrendObserver was created");
        this.itsLog=aLog;
    }

    @Override
    public void Update(Trend Data) {
        itsLog.pressureTrendPrint(Data);
    }

    @Override
    public String getClassName() {
        return "LogPressTrendObserver";
    }
}

