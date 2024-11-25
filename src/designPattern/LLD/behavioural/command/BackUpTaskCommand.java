package designPattern.LLD.behavioural.command;

/**
 * <Class Name>: BackUpTaskCommand
 * <p>
 * Description: This class is used for... this is also concrete command
 * <p>
 * Created by: neeraj
 * Date: 15/11/24
 */
public class BackUpTaskCommand implements TaskCommand {
    private final BackUpService backUpService;
    private final String location;

    public BackUpTaskCommand(BackUpService backUpService, String location) {
        this.backUpService = backUpService;
        this.location = location;
    }

    @Override
    public void execute() {
        backUpService.performBackup(location);
    }
}
