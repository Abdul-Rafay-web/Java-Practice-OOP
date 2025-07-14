package JavaPractice.Q11;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RideReport {
    private int tourists;
    private int individuals;
    private int corporates;
    private double totalEarnings;
    private int totalRewardPoints;
    public void updateReport(double fare,int points,Customer customer){
        totalEarnings+=fare;
        totalRewardPoints+=points;
        switch (customer.getCategory().toLowerCase()){
            case "Individual":
                this.individuals++;
                break;
            case "Corporate":
                this.corporates++;
                break;
            case "Tourist":
                this.tourists++;
                break;
        }
    }
    public void generateReport(){
        System.out.println("Total Earnings: "+this.totalEarnings);
        System.out.println("Total Reward Points: "+this.totalRewardPoints);
        System.out.println("Total Tourists: "+this.tourists);
        System.out.println("Total Individuals: "+this.individuals);
        System.out.println("Total Corporates: "+this.corporates);
    }
}
