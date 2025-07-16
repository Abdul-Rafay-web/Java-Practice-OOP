package JavaPractice.Q17;

public abstract class Vehicle {
    protected int vehicleId;
    protected String currentLocation;
    protected int capacity;
    protected boolean status;
    public Vehicle(int vehicleId,String currentLocation,int capacity){
        this.vehicleId=vehicleId;
        this.currentLocation=currentLocation;
        this.capacity=capacity;
        this.status=false;
    }

    public abstract void moveTo(String location);
    public abstract void getDetails();
    public boolean getStatus(){
        return status;
    }
}
