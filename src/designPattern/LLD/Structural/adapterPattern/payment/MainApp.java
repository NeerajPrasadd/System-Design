package designPattern.LLD.Structural.adapterPattern.payment;

/**
 * <Class Name>: MainApp
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class MainApp {

    public static void main(String[] args) {
        PaymentGateway palPay = new PaypalAdapter(new Paypal());
        PaymentGateway stripePay = new StripePayAdapter(new StripePay());

        double chage =100;
        palPay.processPayment(chage);
        stripePay.processPayment(chage);


    }
}
