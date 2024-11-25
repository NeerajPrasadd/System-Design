package designPattern.LLD.Creational;

/**
 * <Class Name>: SingletonLazyPattern
 * <p>
 * Lazy pattern for singleton pattern
 * <p>
 * Created by: neeraj
 * Date: 29/09/24
 */
public class SingletonLazyPattern {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        singletonLazy.showMessage();

    }
}

class SingletonLazy {
    private static SingletonLazy INSTANCE;

    // Private constructor to prevent instantiation
    private SingletonLazy() {
    }

    // Provide a global point of access
    public static SingletonLazy getInstance() {

        return INSTANCE == null ? new SingletonLazy() : INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello from SingletonLazy!");
    }
}