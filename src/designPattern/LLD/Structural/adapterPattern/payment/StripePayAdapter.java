package designPattern.LLD.Structural.adapterPattern.payment;

/**
 * <Class Name>: StripePayAdapter
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class StripePayAdapter implements PaymentGateway {
    private StripePay stripePay;

    public StripePayAdapter(StripePay stripePay) {
        this.stripePay = stripePay;
    }

    @Override
    public void processPayment(double amount) {
        stripePay.makeTransaction(amount);
    }
}
