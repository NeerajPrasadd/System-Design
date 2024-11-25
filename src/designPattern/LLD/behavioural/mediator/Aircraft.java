package designPattern.LLD.behavioural.mediator;

/**
 * <Class Name>: Aircraft
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 18/11/24
 */
public abstract class Aircraft {
    protected   AircraftTrafficController  atc;
    protected String name;

    public Aircraft(AircraftTrafficController atc, String name) {
        this.atc = atc;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message, String senderName);
}
