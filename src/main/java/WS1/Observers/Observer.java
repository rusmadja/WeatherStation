package WS1.Observers;

public interface Observer<T> {
    void Update(T Data);
    String getClassName();
}
