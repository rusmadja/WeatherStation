package WS1.Observers;

public class LogPressObserver implements Observer<Integer>{

    private Log itsLog;

    public LogPressObserver(Log log){
        System.out.println("LogPressObserver was created");
        this.itsLog= log;
    }
    @Override
    public void Update(Integer Data) {
        itsLog.pressurePrint(Data);
    }
    @Override
    public String getClassName() {
        return "LogPressObserver";
    }
}
