package designPattern.LLD.Structural.bridgePattern;

/**
 * <Class Name>: RemoteControl
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void power() {
        device.power();
    }

    public void volumeUp() {
        device.volumeUp();
    }

    public void volumeDown() {
        device.volumeDown();

    }

    public boolean isPowerOn() {
       return device.isPowerOn();
    }
}
