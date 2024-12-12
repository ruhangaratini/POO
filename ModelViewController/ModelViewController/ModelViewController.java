package ModelViewController;

public class ModelViewController {

    public static void main(String[] args) {
        final Model model = new Model();
        final View view = new View();
        final ViewX viewX = new ViewX();
        final Controller controller = new Controller();

        controller.route(view, model);
        controller.route(viewX, model);

        model.updateData("Hello world!");
        view.changeData("Change data");
        viewX.changeData("View X");
    }

}
