package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileReader;

public class DAOHelloWorld {
	private static String			FileName			= "helloworld.txt";
	private static DAOHelloWorld	instance			= null;
	private String					helloWorldMessage	= null;

	private DAOHelloWorld() {
		this.readFile();
	}

	public static DAOHelloWorld getInstance() {
		if (instance == null) {
			setInstance(new DAOHelloWorld());
		}
		return instance;
	}

	private static void setInstance(final DAOHelloWorld instance2) {
		instance = instance2;
	}

	private void readFile() {
		BufferedReader bufferstock = null;
		try {
			bufferstock = new BufferedReader(new FileReader(DAOHelloWorld.FileName));
			this.helloWorldMessage = bufferstock.readLine();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	public String getHelloWorldMessage() {
		return this.helloWorldMessage;
	}

	public void setHelloWorldMessage(final String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

}
