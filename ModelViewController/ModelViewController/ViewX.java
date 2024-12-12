package ModelViewController;

public class ViewX implements IView {
    private IModel model;

    @Override
    public void setModel(IModel model) {
        this.model = model;
    }

    @Override
    public void update() {
        this.showData(this.model.getData());
    }

    @Override
    public void showData(String data) {
        System.out.println(data);
    }

    @Override
    public void changeData(String data) {
        this.model.updateData(data);
    }

}
