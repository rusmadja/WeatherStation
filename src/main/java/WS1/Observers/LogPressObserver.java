package WS1.Observers;

public class LogPressObserver implements Observer<Integer>{

    public Log itsLog;

    public LogPressObserver(Log log){
        System.out.println("LogPressObserver was created");
        itsLog= log;
    }
    @Override
    public void Update(Integer Data) {
        itsLog.printPressures(Data);
    }
    @Override
    public String getClassName() {
        return "LogPressObserver";
    }
}
