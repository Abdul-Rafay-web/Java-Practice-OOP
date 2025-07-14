package JavaPractice.Q11;

public class Customer {
    protected String name;
    protected String category;
    protected double ratePerKm;
    ContactDetails contactDetails;
    protected double processingFee;
    protected double tax;
    public Customer(String name,String category,double ratePerKm){
        this.category=category;
        this.name=name;
        this.ratePerKm=ratePerKm;
    }

    public String getCategory() {
        return category;
    }

    public void addContactDetails(ContactDetails contactDetails){
        this.contactDetails=contactDetails;
    }
    protected double FareCalculator(int km,double tax,double processingFee){
    double initialPrice=km*ratePerKm;
    double taxPrice=initialPrice+initialPrice*tax;
    return(taxPrice*taxPrice+processingFee);
    }
    public double calculateFare(int km){
        return 0;
    }
    public int calculateReward(int km){
        return 0;
    }
}
