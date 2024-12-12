package ModelViewActiveController;

public class MyController {
    private IMyView view;
    private IMyModel model;

    public void route(IMyView view, IMyModel model) {
        this.view = view;
        this.model = model;

        view.setController(this);
        model.setController(this);
    }

    public void sendMessageToModel(String data) {
        this.model.update(data);
    }

    public void sendMessageToView(String data) {
        this.view.update(data);
    }

}
