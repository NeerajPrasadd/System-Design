package designPattern.LLD.behavioural.cor;

/**
 * <Class Name>: ChainOfResponsibility
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 06/11/24
 */
public class ChainOfResponsibilityApplication {
    public static void main(String[] args) {
        LevelHandler1 levelHandler1 =  new LevelHandler1();
        LevelHandler2 levelHandler2 =  new LevelHandler2();
        LevelHandler3 levelHandler3 =  new LevelHandler3();
        levelHandler1.nextHandler(levelHandler2);;
        levelHandler2.nextHandler(levelHandler3);
        SupportRequest request1 = new SupportRequest("Password reset", 1);  // Low severity
        SupportRequest request2 = new SupportRequest("Network issue", 2);    // Medium severity
        SupportRequest request3 = new SupportRequest("Server down", 3);

        levelHandler1.handleRequest(request3);
    }
}
