package designPattern.LLD.Structural.decorator;

/**
 * <Class Name>: SeverityLogger
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class SeverityLogger extends LoggerDecorator{

    private String severity;

    public SeverityLogger(Logger logger,String severity) {
        super(logger);
        this.severity = severity;
    }

    @Override
    public void log(String message) {
        message = "[" + severity.toUpperCase() + "] " + message;
        super.log(message);
    }
}
