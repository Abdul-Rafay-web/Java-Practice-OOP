package JavaPractice.AutonomousDroneDeliverySystemforMedicalSupplies;

public class EmergencyDrone extends Drone{
    public EmergencyDrone(String Id){
        super(Id,80,75);
    }

    @Override
    public void delivery() throws DeliveryFailedException,InvalidBatteryException {
        boolean isLow=false;
        if(this.battery<20){ isLow=true;
            throw new InvalidBatteryException("Battery is Low ");
        }
        if (isLow){
            throw new DeliveryFailedException("Drone cannot deliver");
        }
        System.out.println("Your Emergency Delivery has Started");
        this.battery-=10;
    }
}
