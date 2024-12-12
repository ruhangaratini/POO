package ModelViewActiveController;

public class MyView implements IMyView {
    private String data;
    private MyController controller;

    @Override
    public void setController(MyController controller) {
        this.controller = controller;
    }

    @Override
    public void update(String data) {
        this.data = data;
        this.show();
    }

    @Override
    public void show() {
        System.out.println(this.data);
    }

    @Override
    public void input(String data) {
        this.controller.sendMessageToModel(data);
    }
}
