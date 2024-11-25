package designPattern.LLD.Structural.decorator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <Class Name>: TimeStampLogger
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class TimeStampLogger extends LoggerDecorator{

    public TimeStampLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        message = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + " - " + message;
        super.log(message);
    }
}
