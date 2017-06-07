package helloworldmvc.main;

import helloworldmvc.Contract.IModel;
import helloworldmvc.Contract.IView;
import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Main {

	public static void main(final String[] args) {
		final IModel model = new Model();
		final IView view = new View();
		final Controller controller = new Controller(view, model);
		controller.run();

	}

}
