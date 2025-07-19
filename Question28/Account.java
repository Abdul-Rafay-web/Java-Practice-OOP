package JavaPractice.Question28;

public abstract class Account {
    protected int accountNumber;
    protected double balance;
    public Account(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
    public abstract double computeInterest();
}
