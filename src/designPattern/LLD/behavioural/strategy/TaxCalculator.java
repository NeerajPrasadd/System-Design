package designPattern.LLD.behavioural.strategy;

/**
 * <Class Name>: TaxCalculator
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 20/11/24
 */
public class TaxCalculator {
    private  TaxStrategy taxStrategy;

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public void calculateTax(double amount){
        if(taxStrategy==null){
            throw  new IllegalStateException("Tax strategy is not set");
        }
        taxStrategy.calculateTax(amount);
    }
}
