package designPattern.LLD.Structural.bridgePattern;

/**
 * <Class Name>: BridgeApp
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class BridgeApp {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();
        RemoteControl tvRC = new BasicRemote(tv);
        RemoteControl radioRC =  new AdvanceRemote(radio);
        tvRC.power();
        tvRC.volumeUp();
        tvRC.volumeDown();

        radioRC.power();
        radioRC.volumeUp();
        radioRC.volumeDown();
        ((AdvanceRemote) radioRC).mute();
    }
}
