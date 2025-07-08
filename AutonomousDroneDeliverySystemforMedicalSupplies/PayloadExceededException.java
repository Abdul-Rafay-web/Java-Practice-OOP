package JavaPractice.AutonomousDroneDeliverySystemforMedicalSupplies;

public class PayloadExceededException extends RuntimeException {
    public PayloadExceededException(String message) {
        super(message);
    }
}
