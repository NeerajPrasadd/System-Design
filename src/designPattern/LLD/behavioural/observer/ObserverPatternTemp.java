package designPattern.LLD.behavioural.observer;

/**
 * <Class Name>: ObserverPatternTemp
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 18/11/24
 */
public class ObserverPatternTemp {
    public static void main(String[] args) {
        Observer observer = new PhoneObserver("Neeraj's phone");
        Observer observer1 = new PhoneObserver("Prasadd's phone");
        Observer web = new WebObserver();

        WeatherStation weatherSubject  =  new WeatherStation();
        weatherSubject.attach(observer);
        weatherSubject.attach(observer1);
        weatherSubject.attach(web);

        weatherSubject.setMessage("temp is 20");
        weatherSubject.detach(observer);

        weatherSubject.setMessage("temp is 18");


    }
}
