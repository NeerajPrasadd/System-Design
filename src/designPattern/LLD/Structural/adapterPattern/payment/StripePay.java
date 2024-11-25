package designPattern.LLD.Structural.adapterPattern.payment;

/**
 * <Class Name>: Paypal
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class StripePay {

    public void makeTransaction(double amount ){
        System.out.println(this.getClass().getName() +" make payement +" + amount);
    }
}
