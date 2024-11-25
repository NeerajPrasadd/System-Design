package designPattern.LLD.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * <Class Name>: ATCMediator
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 18/11/24
 */
public class ATCMediator implements AircraftTrafficController {

    private List<Aircraft> aircraftList = new ArrayList<>();

    @Override
    public void registerAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

    @Override
    public void sendMessage(Aircraft aircraft, String message) {
        aircraftList.stream()
                .filter(a -> a != aircraft)
                .forEach(aircraft1 -> aircraft1.receive(message, aircraft.name));

    }
}
