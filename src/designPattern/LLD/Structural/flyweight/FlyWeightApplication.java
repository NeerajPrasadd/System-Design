package designPattern.LLD.Structural.flyweight;

/**
 * <Class Name>: FlyWeightApplication
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 06/11/24
 */
public class FlyWeightApplication {
    public static void main(String[] args) {
        ConnectionPoll connectionPoll = new ConnectionPoll("hello/neerajPrasadd", 2);

        DatabaseConnection db1 = connectionPoll.getConnection();
        if (db1 != null) {
            db1.connect();
        } else {
            System.out.println("no connection found");
        }

        DatabaseConnection db2 = connectionPoll.getConnection();
        if (db2 != null) {
            db2.connect();
        } else {
            System.out.println("no connection found");
        }
        DatabaseConnection db3 = connectionPoll.getConnection();
        if (db3 != null) {
            db3.connect();
        } else {
            System.out.println("no connection found");
        }
        if (db1 != null) {
//            db1.connect();
            db1.disconnect();
            connectionPoll.releaseConnection(db1);
        } else {
            System.out.println("no connection found");
        }

        db3 = connectionPoll.getConnection();
        if (db3 != null) {
            db3.connect();
        } else {
            System.out.println("no connection found");
        }


    }
}
