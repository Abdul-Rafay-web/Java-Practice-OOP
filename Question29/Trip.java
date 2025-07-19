package JavaPractice.Question29;

public abstract class Trip {
    protected String departureCity;
    protected String arrivalCity;
    protected double basicPrice;
    protected Trip(String dp,String ac,double bp){
        this.departureCity=dp;
        this.arrivalCity=ac;
        this.basicPrice=bp;
    }
    public abstract double calculateCost();

    @Override
    public String toString() {
        return "Trip{" +
                "departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", basicPrice=" + basicPrice +
                '}';
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }
}
