package WS1.Observers;

public class LogPressTrendObserver implements Observer<Trend>{
    public Log itsLog;
    public LogPressTrendObserver(Log aLog){
        System.out.println("LogPressTrendObserver was created");
        itsLog=aLog;
    }

    @Override
    public void Update(Trend Data) {
        itsLog.printTrendPressures(Data);
    }

    @Override
    public String getClassName() {
        return "LogPressTrendObserver";
    }
}

