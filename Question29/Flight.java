package JavaPractice.Question29;

public class Flight extends Trip implements Economical{
    private String seatClass;
    public Flight(String dc,String ac,double bp,String seatClass){
        super(dc,ac,bp);
        if (seatClass.equalsIgnoreCase("First")||seatClass.equalsIgnoreCase("Economic")){
            this.seatClass=seatClass;
        }else {
            this.seatClass="Invalid";
        }
    }
    public String toString(){
        return "The Flight Departing from"+this.getDepartureCity()+", will Arrive At "+this.getArrivalCity()+" at a basic Price"+this.getBasicPrice()+" Seat type: "+this.seatClass;
    }

    @Override
    public double calculateCost() {
        if (this.seatClass.equalsIgnoreCase("Economic")){
            return this.getBasicPrice();
        }else{
            return (this.getBasicPrice()*0.25);
        }
    }

    @Override
    public void economize() {
        this.seatClass="Economic";
    }
}

