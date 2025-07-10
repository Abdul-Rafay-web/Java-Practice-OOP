package JavaPractice.GenericsAndWildCard;

public class BankAccountTransaction extends Transaction{
    @Override
    protected void printTransaction() {
        System.out.println("This is Transaction for Bank Account");
    }
}
