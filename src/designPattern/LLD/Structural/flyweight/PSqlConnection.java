package designPattern.LLD.Structural.flyweight;

/**
 * <Class Name>: PSqlConnection
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 06/11/24
 */
public class PSqlConnection implements DatabaseConnection {
    private String connectionString;

    public PSqlConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public void connect() {
        System.out.println("Connected to database: " + connectionString);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from database: " + connectionString);

    }
}
