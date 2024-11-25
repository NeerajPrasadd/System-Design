package designPattern.LLD.Structural.decorator;

/**
 * <Class Name>: SimpleLogger
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class SimpleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println( message);
    }
}
