package designPattern.LLD.Structural.bridgePattern;

/**
 * <Class Name>: TV
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class TV implements Device {

    private boolean on = false;
    private int volume = 10;

    @Override
    public void power() {
        on =!on;
        System.out.println("TV power " + (on ? "ON" : "OFF"));
    }

    @Override
    public void volumeUp() {
        if (on) {
            volume++;
            System.out.println("TV volume: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (on) {
            volume--;
            System.out.println("TV volume: " + volume);
        }

    }

    @Override
    public boolean isPowerOn() {
        return on;
    }
}
