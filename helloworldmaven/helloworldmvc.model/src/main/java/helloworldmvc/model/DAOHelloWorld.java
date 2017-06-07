package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * The Class DAOHelloWorld.
 */
public class DAOHelloWorld {

    /** The File name. */
    private static String        FileName          = "helloworld.txt";

    /** The instance. */
    private static DAOHelloWorld instance          = null;

    /** The hello world message. */
    private String               helloWorldMessage = null;

    /**
     * Instantiates a new DAO hello world.
     */
    private DAOHelloWorld() {
        this.readFile();
    }

    /**
     * Gets the single instance of DAOHelloWorld.
     *
     * @return single instance of DAOHelloWorld
     */
    public static DAOHelloWorld getInstance() {
        if (DAOHelloWorld.instance == null) {
            DAOHelloWorld.setInstance(new DAOHelloWorld());
        }
        return DAOHelloWorld.instance;
    }

    /**
     * Sets the instance.
     *
     * @param instance2
     *            the new instance
     */
    private static void setInstance(final DAOHelloWorld instance2) {
        DAOHelloWorld.instance = instance2;
    }

    /**
     * Read file.
     */
    private void readFile() {
        BufferedReader bufferstock = null;
        try {
            bufferstock = new BufferedReader(new FileReader(DAOHelloWorld.FileName));
            this.helloWorldMessage = bufferstock.readLine();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets the hello world message.
     *
     * @return the hello world message
     */
    public String getHelloWorldMessage() {
        return this.helloWorldMessage;
    }

    /**
     * Sets the hello world message.
     *
     * @param helloWorldMessage
     *            the new hello world message
     */
    public void setHelloWorldMessage(final String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }

}
