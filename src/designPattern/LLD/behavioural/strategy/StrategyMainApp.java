package designPattern.LLD.behavioural.strategy;

/**
 * <Class Name>: StrategyMainApp
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 20/11/24
 */
public class StrategyMainApp {

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.setTaxStrategy(new USATaxCalculator());
        taxCalculator.calculateTax(1000);

        taxCalculator.setTaxStrategy(new IndiaTaxCalculator());
        taxCalculator.calculateTax(1000);
        taxCalculator.setTaxStrategy(new UKTaxCalculator());
        taxCalculator.calculateTax(1000);
    }
}
