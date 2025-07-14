package JavaPractice.Q11;

public class IndividualCustomer extends Customer{
    public IndividualCustomer(String name,String category,double ratePerkm){
        super(name,category,ratePerkm);
        this.tax=0.05;
        this.processingFee=0.02;
    }
    @Override
    public double calculateFare(int km){
        return FareCalculator(km,tax,processingFee);
    }
    @Override
    public int calculateReward(int km){
        return (int)((km)*2);
    }
}
