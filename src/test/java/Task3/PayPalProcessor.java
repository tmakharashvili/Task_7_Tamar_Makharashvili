package Task3;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void process(double amount){
        System.out.println(amount);

    }
}
