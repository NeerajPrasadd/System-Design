package designPattern.LLD.behavioural.state;

/**
 * <Class Name>: RedLightState
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 19/11/24
 */
public class GreenLightState implements TrafficLightState {

    @Override
    public void handleState() {
        System.out.println("This is Green light");
    }
}
