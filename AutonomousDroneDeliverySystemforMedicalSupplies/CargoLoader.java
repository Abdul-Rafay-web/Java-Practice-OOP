package JavaPractice.AutonomousDroneDeliverySystemforMedicalSupplies;

public class CargoLoader<T extends Drone>{
    private T[] drones;


    public void setDrones(T[] drones) {
        this.drones = drones;
    }

    public T[] getDrones() {
        return drones;
    }

}
