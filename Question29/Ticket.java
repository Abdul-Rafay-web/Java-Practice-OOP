package JavaPractice.Question29;

import java.util.Arrays;

public class Ticket {
    private String ticketNumber;
    private static int ticketCounter=0;
    private Trip[] trips;
    private int tripCounter;
    public Ticket(String ticketNumber){
        this.ticketNumber=ticketNumber;
        this.trips=new Trip[10];
        ticketCounter++;
        this.tripCounter=0;
    }
    public void addTrip(Trip t){
        if (tripCounter<trips.length){
            trips[tripCounter]=t;
            tripCounter++;
        }else{
            System.out.println("There cannot be more Trips added");
        }
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", trips=" + Arrays.toString(trips) +
                ", tripCounter=" + tripCounter +
                '}';
    }
}
