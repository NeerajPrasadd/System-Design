package designPattern.LLD.behavioural.state;

/**
 * <Class Name>: RedLightState
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 19/11/24
 */
public class RedLightState implements TrafficLightState {

    @Override
    public void handleState() {
        System.out.println("This is red light");
    }
}
