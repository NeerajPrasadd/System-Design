package designPattern.LLD.behavioural.strategy;

/**
 * <Class Name>: USATaxCalculator
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 20/11/24
 */
public class UKTaxCalculator implements TaxStrategy {
    @Override
    public void calculateTax(double amount) {
        System.out.println("Usa tax amount :" + amount * .18);
    }
}
