package ModelViewController;

public interface IModel {
    void updateData(String data);
    void setView(IView view);
    String getData();
}
