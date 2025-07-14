package JavaPractice.Q11;

public class TouristCustomer extends Customer{
    public TouristCustomer(String name,String category,double ratePerkm){
        super(name,category,ratePerkm);
        this.tax=0.1;
        this.processingFee=0.05;
    }
    @Override
    public double calculateFare(int km){
        return FareCalculator(km,tax,processingFee);
    }
    @Override
    public int calculateReward(int km){
        return (int)((km)*3);
    }
}
