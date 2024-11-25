package designPattern.LLD.Structural.decorator;

/**
 * <Class Name>: InfoLog
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class InfoLogger extends LoggerDecorator {

    public InfoLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        message = "[INFO] " + message;
        super.log(message);
    }
}
