package designPattern.LLD.behavioural.template;

/**
 * <Class Name>: DataProcessor
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 20/11/24
 */
public abstract class DataProcessor {
    public final void processData(){
        loadData();
        process();
        saveData();

    }

    void loadData() {
        System.out.println("Loading data...");
    }

    void saveData() {
        System.out.println("Saving processed data...");
    }

    // Abstract step to be implemented by subclasses
    abstract void process();
}
