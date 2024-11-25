package designPattern.LLD.behavioural.mediator;

/**
 * <Class Name>: PessangerAircraft
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 18/11/24
 */
public class CargoAircraft extends Aircraft {


    public CargoAircraft(AircraftTrafficController atc, String name) {
        super(atc,name);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        atc.sendMessage(this,message);

    }

    @Override
    public void receive(String message, String senderName) {
        System.out.println(name + " receives from " + senderName + ": " + message);
    }
}
