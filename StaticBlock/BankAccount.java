package StaticBlock;

public class BankAccount {
    private double balance;
    private static double interestRate;
    private double interestAmount;
    public BankAccount(double balance) {
        this.balance=balance;
    }
    public static void changeInterestRate(double newInterestRate) {
        interestRate=newInterestRate;
    }
    public void interestCalculation() {
        this.interestAmount=(this.balance*interestRate)/100;
        this.interestAmount+=this.balance;
        System.out.println("Interest Amount: "+this.interestAmount);
    }
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(500);
        BankAccount.changeInterestRate(5);
        bankAccount.interestCalculation();
    }
}
