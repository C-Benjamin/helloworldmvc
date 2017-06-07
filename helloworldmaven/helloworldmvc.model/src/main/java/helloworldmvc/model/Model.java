package helloworldmvc.model;

import helloworldmvc.Contract.IModel;

public class Model implements IModel {
	public String getHelloWorld() {
		return DAOHelloWorld.getInstance().getHelloWorldMessage();
	}

}