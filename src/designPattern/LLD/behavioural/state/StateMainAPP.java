package designPattern.LLD.behavioural.state;

/**
 * <Class Name>: StateMainAPP
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 19/11/24
 */
public class StateMainAPP {
    public static void main(String[] args) {
        TrafficLightState redLight = new RedLightState();
        TrafficLightState greenLight = new GreenLightState();
        TrafficLightState yellowLight = new YellowLightState();

        TrafficLight trafficLight = new TrafficLight(redLight);

        trafficLight.handleState();
        trafficLight.setTrafficLightState(yellowLight);
        trafficLight.handleState();
        trafficLight.setTrafficLightState(greenLight);
        trafficLight.handleState();
    }
}
