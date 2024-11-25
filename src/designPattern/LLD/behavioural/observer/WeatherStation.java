package designPattern.LLD.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <Class Name>: WeatherStation
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 18/11/24
 */
public class WeatherStation implements Subject {

    private List<Observer> observerList = new ArrayList<>();
    private String message;

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(message));
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
