package designPattern.LLD.Creational;

/**
 * <Class Name>: SingletonPattern
 * <p>
 *  Eager Initialization Singleton
 * <p>
 * Created by: neeraj
 * Date: 29/09/24
 */
public class SingletonPattern {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
        if(singleton == Singleton.getInstance()){
            System.out.println("same instance");
        }else {
            System.out.println("Difference instance");
        }
    }

}

class Singleton{
    private static final Singleton INSTANCE = new Singleton();

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Provide a global point of access
    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}