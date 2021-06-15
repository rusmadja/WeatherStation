package WS1.Observers;

public class LogPressTrendObserver implements Observer<Trend>{
    private Log log;
    public LogPressTrendObserver(Log aLog){
        System.out.println("LogPressTrendObserver was created");
        this.log =aLog;
    }

    @Override
    public void Update(Trend Data) {
        log.pressureTrendPrint(Data);
    }

    @Override
    public String getClassName() {
        return "LogPressTrendObserver";
    }
}

