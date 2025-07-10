package JavaPractice.GenericsAndWildCard;

public class UPIPaymentTransaction extends Transaction{
    @Override
    protected void printTransaction() {
        System.out.println("This is a Transaction for UPI Payment");
    }
}
