package ModelViewController;

public class Model implements IModel {
    private IView view;
    private String data = "";

    @Override
    public void setView(IView view) {
        this.view = view;
    }

    @Override
    public void updateData(String data) {
        this.data = data;
        this.view.update();
    }

    @Override
    public String getData() {
        return this.data;
    }
}
