package ModelViewController;

public interface IView {
    void setModel(IModel model);
    void update();
    void showData(String data);
    void changeData(String data);
}
