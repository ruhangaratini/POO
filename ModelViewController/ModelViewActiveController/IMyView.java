package ModelViewActiveController;

public interface IMyView {
    void setController(MyController controller);
    void update(String data);
    void show();
    void input(String data);
}
