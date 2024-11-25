package designPattern.LLD.Structural.adapterPattern.payment;

/**
 * <Class Name>: PaypalAdapter
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class PaypalAdapter implements PaymentGateway {

    private Paypal paypal;

    public PaypalAdapter(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(double amount) {
        paypal.makeTransaction(amount);
    }
}
