package Task3;

public class CreditCardProcessor implements PaymentProcessor{
    @Override
    public void process(double amount){
        System.out.println(amount);
    }
}
