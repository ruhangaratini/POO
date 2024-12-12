package ModelViewActiveController;

public class ModelViewActiveController {

    public static void main(String[] args) {
        final MyModel model = new MyModel();
        final MyView view = new MyView();
        final MyController controller = new MyController();

        controller.route(view, model);

        view.input("Hello World!");
        model.update("Model updated");
    }

}
