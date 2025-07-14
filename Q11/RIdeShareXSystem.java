package JavaPractice.Q11;

import java.util.ArrayList;

public class RIdeShareXSystem {
    private ArrayList<Customer> customers;
    private RideReport rideReport;
    public RIdeShareXSystem(){
        this.customers=new ArrayList<>();
    }
    public void addCustomer(Customer c,int km){
        customers.add(c);
       double fare=c.calculateFare(km);
       int points=c.calculateReward(km);
       rideReport.updateReport(fare,points,c);
    }
    public void generateReport(){
rideReport.generateReport();
    }
}
