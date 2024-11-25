package designPattern.LLD.behavioural.mediator;

/**
 * <Class Name>: MediatorPatternATCExample
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 18/11/24
 */
public class MediatorPatternATCExample {
    public static void main(String[] args) {
        AircraftTrafficController aircraftTrafficController =  new ATCMediator();

        Aircraft passangerAircfat = new PassengerAircraft(aircraftTrafficController,"indigo 6e123");
        Aircraft passange2Aircfat = new PassengerAircraft(aircraftTrafficController,"airindia bharat");
        Aircraft cargoAircfat = new CargoAircraft(aircraftTrafficController,"airindia cargo");

        aircraftTrafficController.registerAircraft(passange2Aircfat);
        aircraftTrafficController.registerAircraft(passangerAircfat);
        aircraftTrafficController.registerAircraft(cargoAircfat);
        passangerAircfat.send("Requesting landing clearance.");
        passange2Aircfat.send("Holding pattern at 10,000 feet.");
        cargoAircfat.send("Departing runway 27.");

    }
}
