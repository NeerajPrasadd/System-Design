package designPattern.LLD.behavioural.command;

/**
 * <Class Name>: BackUpService
 * <p>
 * Description: This class is used for... Receiver
 * <p>
 * Created by: neeraj
 * Date: 15/11/24
 */
public class BackUpService {
    public void performBackup(String location) {
        System.out.println("Backing up data to " + location);
    }
}
