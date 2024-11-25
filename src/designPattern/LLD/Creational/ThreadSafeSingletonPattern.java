package designPattern.LLD.Creational;

/**
 * <Class Name>: ThreadSafeSingleton
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 29/09/24
 */
public class ThreadSafeSingletonPattern {
    public static void main(String[] args) {
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        threadSafeSingleton.showMessage();

        ThreadSafeSingletonDoubleCheck threadSafeSingletonDoubleCheck = ThreadSafeSingletonDoubleCheck.getInstance();
        threadSafeSingletonDoubleCheck.showMessage();
    }
}

class ThreadSafeSingleton {
    private static ThreadSafeSingleton INSTANCE;

    // Private constructor to prevent instantiation
    private ThreadSafeSingleton() {
    }

    // Provide a global point of access
    public static synchronized ThreadSafeSingleton getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ThreadSafeSingleton();

        return INSTANCE;

    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

class ThreadSafeSingletonDoubleCheck {
    private static ThreadSafeSingletonDoubleCheck INSTANCE;

    // Private constructor to prevent instantiation
    private ThreadSafeSingletonDoubleCheck() {
    }

    // Provide a global point of access
    public static ThreadSafeSingletonDoubleCheck getInstance() {
        if (INSTANCE == null)
            synchronized (ThreadSafeSingletonDoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ThreadSafeSingletonDoubleCheck();
                }
            }


        return INSTANCE;

    }

    public void showMessage() {
        System.out.println(this.getClass() + " Hello from Singleton!");
    }
}