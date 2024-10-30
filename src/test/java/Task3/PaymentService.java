package Task3;

public class PaymentService {
    public static void executePayment(PaymentProcessor paymentProcessor, double amount){
        paymentProcessor.process(amount);
    }

    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        PaymentProcessor payPalProcessor = new PayPalProcessor();

        executePayment(creditCardProcessor, 55);
        executePayment(payPalProcessor,105);
    }
}
