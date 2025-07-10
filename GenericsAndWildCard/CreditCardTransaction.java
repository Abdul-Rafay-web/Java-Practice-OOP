package JavaPractice.GenericsAndWildCard;

public class CreditCardTransaction extends Transaction{
    @Override
    protected void printTransaction() {
        System.out.println("this is a transaction for Credit Card");
    }
}
