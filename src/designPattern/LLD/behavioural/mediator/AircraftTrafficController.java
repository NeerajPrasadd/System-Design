package designPattern.LLD.behavioural.mediator;

public interface AircraftTrafficController {
        void registerAircraft(Aircraft aircraft);
        void sendMessage(Aircraft aircraft, String message);
}
