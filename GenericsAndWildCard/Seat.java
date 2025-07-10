package JavaPractice.GenericsAndWildCard;

public abstract class Seat {
    protected  String seatType;
    protected boolean reserved;
    public Seat(String seatType,boolean reserved){
        this.seatType=seatType;
        this.reserved=reserved;
    }

    public String getSeatType() {
        return seatType;
    }

    public boolean isReserved() {
        return reserved;
    }
}
