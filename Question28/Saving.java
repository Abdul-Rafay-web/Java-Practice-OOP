package JavaPractice.Question28;

import JavaPractice.Q8.A;

public class Saving extends Account implements Comparable<Saving>{
    private double rate;
    private int nbYear;
    public Saving(int accountNumber,double balance,double rate,int nbYear){
        super(accountNumber,balance);
        this.nbYear=nbYear;
        this.rate=rate;
    }
    @Override
    public double computeInterest(){
        return (nbYear*rate*balance);
    }
    @Override
    public String toString(){
        return super.toString()+"Rate: "+rate+" NB Year: "+nbYear;
    }
    @Override
    public int compareTo(Saving saving){
return Double.compare(this.computeInterest(),saving.computeInterest());
    }
}
