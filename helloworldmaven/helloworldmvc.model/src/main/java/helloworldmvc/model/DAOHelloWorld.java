package helloworldmvc.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {
	private static String			FileName			= "helloworld.txt";
	private static DAOHelloWorld	instance			= null;
	private String					helloWorldMessage	= null;

	private DAOHelloWorld() {

	}

	private static DAOHelloWorld getInstance() {
		return instance;
	}

	private static void setInstance(final DAOHelloWorld instance1) {
		instance = instance1;
	}

	private void readFile() {
		try {
			final File file = new File(FileName);
			FileReader fileReader = null;
			fileReader = new FileReader(file);
			this.helloWorldMessage = fileReader.toString();
			fileReader.close();
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		} catch (final IOException f) {
			f.printStackTrace();
		}
	}

	public String getHelloWorldMessage() {
		return this.helloWorldMessage;
	}

	public void setHelloWorldMessage(final String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

}
