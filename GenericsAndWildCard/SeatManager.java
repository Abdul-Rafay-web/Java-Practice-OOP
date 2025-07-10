package JavaPractice.GenericsAndWildCard;

import JavaPractice.Q8.B;

import java.util.ArrayList;
import java.util.List;

public class SeatManager<T extends Seat>{
    private ArrayList<T> seats;

    public void setSeats(ArrayList<T> seats) {
        this.seats = seats;
    }
    public void processSeats(ArrayList<? extends T> seats)throws SeatNotAvailableException{
        for (Seat t:seats){System.out.println("Seat: "+t.getSeatType());
            if (!t.reserved){
                throw new SeatNotAvailableException("Sorry, Seat is not available");
            }
            System.out.println("Seat is available");
        }
    }
    public void addNewSeat(List<? extends T> seats){
        this.seats.addAll(seats);
    }
    public static void main(String[] args){
        ArrayList<Seat> seats=new ArrayList<>();
        seats.add(new Business("Business",false));
        seats.add(new Economy("Economy",false));
        seats.add(new FirstClass("First Class",true));
        SeatManager<Seat> seatManager=new SeatManager<>();
        seatManager.setSeats(seats);
        try{
            seatManager.processSeats(seats);
        } catch (SeatNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
