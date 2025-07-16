package JavaPractice.Q17;

public class Car extends Vehicle implements BookAble,ChargeAble{
    protected int battery;
    public Car(int id,String location,int capacity,int battery){
        super(id,location,capacity);
        this.battery=battery;
    }

    @Override
    public boolean getStatus() {
        return super.getStatus();
    }

    @Override
    public void book(String userId) {
        System.out.println("This Car has been Booked For User: "+userId);
    }

    @Override
    public void moveTo(String location) {
        this.currentLocation=location;
        System.out.println("Car is moving to the Location: "+this.currentLocation);
    }

    @Override
    public void cancelBooking() {
        System.out.println("The Car booking has been cancelled");
    }

    @Override
    public void chargeBattery(int units) {
        this.battery+=units;
        System.out.println("Battery Has been charged Successfully,Current Level: "+this.battery);
    }

    @Override
    public int getBatteryLevel() {
        if (this.battery <= 10) {
            System.out.println("Battery Low,Charging needed");
            return this.battery;
        }else {
            return this.battery;
        }
    }
    @Override
    public void getDetails() {
        System.out.println("ID: "+this.vehicleId);
        System.out.println("Capacity: "+this.capacity);
        System.out.println("Current Location: "+this.currentLocation);
    }
}
