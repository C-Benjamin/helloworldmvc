package helloworldmvc.view;

import helloworldmvc.Contract.IView;

public class View implements IView {

	public void displayMessage(final String message) {
		System.out.println(message);
	}

}