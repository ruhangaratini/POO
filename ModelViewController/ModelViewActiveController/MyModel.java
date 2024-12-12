package ModelViewActiveController;

public class MyModel implements IMyModel {
    private String data = "";
    private MyController controller;

    @Override
    public void setController(MyController controller) {
        this.controller = controller;
    }

    @Override
    public void update(String data) {
        this.data = data;
        controller.sendMessageToView(data);
    }

}
