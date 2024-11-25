package designPattern.LLD.behavioural.command;

/**
 * <Class Name>: EmailService
 * <p>
 * Description: This class is used for... this is receiver class
 * <p>
 * Created by: neeraj
 * Date: 15/11/24
 */
public class EmailService {
    public void sendEmail(String recipient, String message) {
        System.out.println("Sending email to " + recipient + " with message: " + message);
    }
}
