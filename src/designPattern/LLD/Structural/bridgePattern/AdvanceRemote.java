package designPattern.LLD.Structural.bridgePattern;

/**
 * <Class Name>: AdvanceRemote
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class AdvanceRemote extends RemoteControl {

    public AdvanceRemote(Device device) {
        super(device);
    }

    public void mute() {
        if (device.isPowerOn()) {
            System.out.println("Muting device.");
            // Assuming muting sets the volume to 0 directly.
            for (int i = 0; i < 20; i++) { // Arbitrary high number for max volume
                device.volumeDown();
            }
        }
    }
}
