package JavaPractice.Q11;

public class CorporateCustomer extends Customer{
    public CorporateCustomer(String name,String category,double ratePerkm){
        super(name,category,ratePerkm);
        this.tax=0.07;
        this.processingFee=0.03;
    }
    @Override
    public double calculateFare(int km){
        return FareCalculator(km,tax,processingFee);
    }
    @Override
    public int calculateReward(int km){
        return (int)((km));
    }
}
