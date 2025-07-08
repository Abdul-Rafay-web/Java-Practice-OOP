package JavaPractice.AutonomousDroneDeliverySystemforMedicalSupplies;

public class StandardDrone extends Drone{
    private int cargo;
    public StandardDrone(String droneID,int cargo){
        super(droneID,100,75);
        this.cargo=cargo;
    }

    @Override
    public void delivery() throws DeliveryFailedException,PayloadExceededException {
        boolean exceeded=false;
        if (cargo>maxPayLoad){exceeded=true;
            throw new PayloadExceededException("PayLoad has exceeded");
        }if (exceeded){
            throw new DeliveryFailedException("Delivery can't be done");
        }
        System.out.println("Delivery will be done Soon");
    }
}
