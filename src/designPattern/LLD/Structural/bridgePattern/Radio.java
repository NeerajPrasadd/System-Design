package designPattern.LLD.Structural.bridgePattern;

/**
 * <Class Name>: Radio
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class Radio implements Device {

    private boolean on = false;
    private int volume = 5;

    @Override
    public void power() {
        on =!on;
        System.out.println("Radio power " + (on ? "ON" : "OFF"));
    }

    @Override
    public void volumeUp() {
        if (on) {
            volume++;
            System.out.println("Radio volume: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (on) {
            volume--;
            System.out.println("Radio volume: " + volume);
        }

    }

    @Override
    public boolean isPowerOn() {
        return on;
    }
}
