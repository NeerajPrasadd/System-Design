package designPattern.LLD.Creational;

interface AbstractFactory {
    Car getInstance(int price);

}

interface Car {
    int getTopSpeed();
    default void getName(){
        System.out.println(this.getClass());
    }
}

/**
 * <Class Name>: AbstractFactoryPattern
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 30/09/24
 */
class AbstractFactoryProducer {
    public AbstractFactory getFactoryInstance(String carType) {
        return "premium".equals(carType) ? new PremiumFactory() : new EconomyFactory();
    }

}

class EconomyFactory implements AbstractFactory {

    @Override
    public Car getInstance(int price) {

        return price > 1500000 ? price > 2000000 ? new EcoCar3() : new EcoCar2() : new EcoCar1();
    }
}

class PremiumFactory implements AbstractFactory {

    @Override
    public Car getInstance(int price) {

        return price > 15000000 ? price > 20000000 ? new LuxCar3() : new LuxCar2() : new LuxCar1();
    }
}


class EcoCar1 implements Car {

    @Override
    public int getTopSpeed() {
        return 100;
    }
}

class EcoCar2 implements Car {

    @Override
    public int getTopSpeed() {
        return 150;
    }
}

class EcoCar3 implements Car {

    @Override
    public int getTopSpeed() {
        return 180;
    }
}

class LuxCar1 implements Car {

    @Override
    public int getTopSpeed() {
        return 200;
    }
}

class LuxCar2 implements Car {

    @Override
    public int getTopSpeed() {
        return 250;
    }
}

class LuxCar3 implements Car {

    @Override
    public int getTopSpeed() {
        return 280;
    }
}


public class AbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractFactoryProducer abstractFactoryProducer =  new AbstractFactoryProducer();
        AbstractFactory abstractFactory = abstractFactoryProducer.getFactoryInstance("premium1");
        Car car = abstractFactory.getInstance(10000000);
        System.out.println(car.getTopSpeed());
        car.getName();
    }
}
