package designPattern.LLD.behavioural.observer;

/**
 * <Class Name>: PhoneObserver
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 18/11/24
 */
public class PhoneObserver implements Observer {
    private final String name;

    public PhoneObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " Display: Temperature updated to " + message + "°C");
    }
}
