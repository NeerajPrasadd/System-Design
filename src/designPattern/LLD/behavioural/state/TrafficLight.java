package designPattern.LLD.behavioural.state;

/**
 * <Class Name>: TrafficLight
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 19/11/24
 */
public class TrafficLight {
    private TrafficLightState trafficLightState;

    public TrafficLight(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }

    public void setTrafficLightState(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }

    public void handleState(){
        trafficLightState.handleState();
    }
}
