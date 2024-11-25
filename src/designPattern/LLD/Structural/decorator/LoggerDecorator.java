package designPattern.LLD.Structural.decorator;

/**
 * <Class Name>: LoggerDecorator
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public abstract class LoggerDecorator implements Logger{

    protected Logger logger;

    public LoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        logger.log(message);
    }
}
