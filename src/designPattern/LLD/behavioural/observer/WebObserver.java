package designPattern.LLD.behavioural.observer;

/**
 * <Class Name>: PhoneObserver
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 18/11/24
 */
public class WebObserver implements Observer {


    @Override
    public void update(String message) {
        System.out.println("Web Display: Temperature updated to " + message + "°C");
    }
}
