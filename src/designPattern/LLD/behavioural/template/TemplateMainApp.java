package designPattern.LLD.behavioural.template;

/**
 * <Class Name>: TemplateMainApp
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 20/11/24
 */
public class TemplateMainApp {

    public static void main(String[] args) {
        DataProcessor dp = new ImageDataProcessor();
        dp.processData();
        dp = new TextDataProcessor();
        dp.processData();
    }
}
