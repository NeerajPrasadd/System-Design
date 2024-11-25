package designPattern.LLD.behavioural.cor;

/**
 * <Class Name>: LevelHandler1
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 06/11/24
 */
public class LevelHandler1 implements SupportHandler {
    private SupportHandler supportHandler;

    @Override
    public void handleRequest(SupportRequest supportRequest) {
        if(supportRequest.getSeverity()<=1){
            System.out.println(" level 1 team handle request + "+ supportRequest.getIssue());
        }else {
            supportHandler.handleRequest(supportRequest);
        }

    }

    @Override
    public void nextHandler(SupportHandler supportHandler) {
        this.supportHandler =supportHandler;
    }
}
