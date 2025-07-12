package JavaPractice.Q3;

public class Car {
    protected String carModel;
    protected String carNumber;
    protected boolean availability;
    protected double ratePerHour;
    protected String type;
    public Car(String carModel,String carNumber,String type,double ratePerHour){
        this.carModel=carModel;
        this.carNumber=carNumber;
        this.ratePerHour=ratePerHour;
        this.type=type;
        this.availability=false;
    }
public String getType(){
        return this.type;
}
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public boolean getAvailability(){
        return this.availability;
    }
    public double generateBill(int hours){
        return hours*ratePerHour;
    }

}
