package WS1.Observers;

public class LogPressObserver implements Observer<Integer>{

    private Log log;

    public LogPressObserver(Log log){
        System.out.println("LogPressObserver was created");
        this.log = log;
    }
    @Override
    public void Update(Integer Data) {
        log.pressurePrint(Data);
    }
    @Override
    public String getClassName() {
        return "LogPressObserver";
    }
}
