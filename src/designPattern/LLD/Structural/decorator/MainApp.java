package designPattern.LLD.Structural.decorator;

/**
 * <Class Name>: MainApp
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class MainApp {
    public static void main(String[] args) {
        Logger logger = new SimpleLogger();

        logger = new TimeStampLogger(logger);

        Logger infoLogger = new InfoLogger(logger);

        Logger debugLogger = new DebugLogger(logger);

        Logger errorLogger = new ErrorLogger(logger);

        infoLogger.log("This is an informational message.");
        debugLogger.log("This is a debug message.");
        errorLogger.log("This is an error message.");
    }
}
