package designPattern.LLD.Creational;

/**
 * <Class Name>: FactoryPattern
 * <p>
 * This will explain how to create object dynamically at runtime
 * <p>
 * Created by: neeraj
 * Date: 29/09/24
 */
public class FactoryPattern {

    public static void main(String[] args) {
        Animal animal =  FactoryPatternApplication.getInstance("human");
        animal.speak();
        Animal tiger =  FactoryPatternApplication.getInstance("Tiger");
        tiger.speak();
    }
}

interface Animal{
    void speak();
}

class Human implements Animal{

    @Override
    public void speak() {
        System.out.println("Human is speaking");
    }
}

class Tiger implements Animal{

    @Override
    public void speak() {
        System.out.println("Tiger is speaking");
    }
}

class FactoryPatternApplication{
    public static Animal getInstance(String name){
        if(name.equals("Tiger"))
            return new Tiger();
        if (name.equals("human")) return new Human();

        return null;
    }

}
