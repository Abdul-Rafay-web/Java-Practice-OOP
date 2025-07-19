package JavaPractice.Question28;

import JavaPractice.Q8.A;

public class Checking extends Account {
    public Checking(int accountNumber,double balance){
        super(accountNumber,balance);
    }
    @Override
    public double computeInterest(){
        return (balance+balance*0.1);
    }
}
