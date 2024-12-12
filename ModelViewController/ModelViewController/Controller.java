package ModelViewController;

public class Controller {

    public void route(IView view, IModel model) {
        view.setModel(model);
        model.setView(view);
    }

}
