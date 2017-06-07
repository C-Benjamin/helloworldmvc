package helloworldmvc.model;

import helloworldmvc.Contract.IModel;

public class Model implements IModel {
    @Override
    public String getHelloWorld() {
        return DAOHelloWorld.getInstance().getHelloWorldMessage();
    }

}