package JavaPractice.AutonomousDroneDeliverySystemforMedicalSupplies;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public abstract class Drone {
    protected String droneId;
    protected int battery;
    protected int maxPayLoad;

    public Drone(String droneId, int battery, int maxPayLoad) {
        this.battery = battery;
        this.maxPayLoad = maxPayLoad;
        this.droneId = droneId;
    }

    public abstract void delivery() throws DeliveryFailedException;

    public void logFlight(String filePath) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        objectOutputStream.writeObject(this);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
