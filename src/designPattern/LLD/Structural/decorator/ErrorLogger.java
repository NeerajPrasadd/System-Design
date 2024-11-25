package designPattern.LLD.Structural.decorator;

/**
 * <Class Name>: InfoLog
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class ErrorLogger extends LoggerDecorator {

    public ErrorLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        message = "[ERROR] " + message;
        super.log(message);
    }
}
