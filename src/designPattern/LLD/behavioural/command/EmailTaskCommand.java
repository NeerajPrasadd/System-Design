package designPattern.LLD.behavioural.command;

/**
 * <Class Name>: EmailTaskCommand
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 15/11/24
 */
public class EmailTaskCommand implements TaskCommand {

    private final EmailService emailService;
    private final String recipient;
    private final String message;

    public EmailTaskCommand(EmailService emailService, String recipient, String message) {
        this.emailService = emailService;
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public void execute() {
        emailService.sendEmail(recipient, message);
    }
}
