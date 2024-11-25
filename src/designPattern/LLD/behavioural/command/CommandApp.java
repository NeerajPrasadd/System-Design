package designPattern.LLD.behavioural.command;

/**
 * <Class Name>: CommandApp
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 15/11/24
 */
public class CommandApp {
    public static void main(String[] args) {
        // Receivers
        EmailService emailService = new EmailService();
        BackUpService backupService = new BackUpService();

        // Concrete Commands
        TaskCommand emailTask = new EmailTaskCommand(emailService, "user@example.com", "Your scheduled report is ready.");
        TaskCommand backupTask = new BackUpTaskCommand(backupService, "/backup/location");

        // Invoker
        TaskScheduler scheduler = new TaskScheduler();

        // Schedule tasks
        scheduler.scheduleTask(emailTask);
        scheduler.scheduleTask(backupTask);

        // Execute all scheduled tasks with a delay of 2000 milliseconds (2 seconds) between each task
        scheduler.executeAllTasks(2000);

        scheduler.scheduleTask(emailTask);
        scheduler.scheduleTask(backupTask);
    }
}
