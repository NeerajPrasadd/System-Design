package designPattern.LLD.Structural.flyweight;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <Class Name>: ConnectionPoll
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 06/11/24
 */
public class ConnectionPoll {

    Queue<DatabaseConnection> connectionPoll;
    int max;

    public ConnectionPoll(String connetionUrl, int max) {
        this.max = max;

        connectionPoll =  new LinkedList<>();
        for (int i=0;i<max;i++ ) {
            connectionPoll.add(new PSqlConnection(connetionUrl));
        }
    }

    public synchronized DatabaseConnection getConnection(){
        if(!connectionPoll.isEmpty()){

            return connectionPoll.poll();
        }
        System.out.println("All connections are in use, waiting for one to be returned...");
        return null;
    }

    public synchronized void releaseConnection(DatabaseConnection databaseConnection){
        connectionPoll.offer(databaseConnection);
        System.out.println("Connection returned to the pool.");

    }
}
