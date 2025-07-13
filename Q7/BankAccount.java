package JavaPractice.Q7;

public class BankAccount {
    private double averageTransaction;
    private String userLocation;
    private int deviceID;

    public BankAccount(double averageTransaction, int deviceID) {
        this.averageTransaction = averageTransaction;
        this.deviceID = deviceID;
        this.userLocation = "Pakistan";
    }

    public void analyzeTransaction(double amount, String userLocation, int deviceID) {
        if (userLocation.equalsIgnoreCase(this.userLocation)) {
            if (deviceID == this.deviceID) {
                if (amount > this.averageTransaction * 0.1 || amount < this.averageTransaction * 0.1) {
                    System.out.println("Safe transaction");
                } else if (amount > this.averageTransaction * 0.3 || amount < this.averageTransaction * 0.3) {
                    System.out.println("Alert:Suspicious Transaction");
                }
            } else {
                System.out.println("Enter a correct Device ID");
            }
        }else{
            System.out.println("High Fraud Risk Detection ");
        }
    }

    public int getDeviceID() {
        return deviceID;
    }

    public double getAverageTransaction() {
        return averageTransaction;
    }

    public String getUserLocation() {
        return userLocation;
    }
    public static void main(String[] args){
        BankAccount bankAccount=new BankAccount(5000,1234);
        bankAccount.analyzeTransaction(50000,"Pakistan",1234);
        bankAccount.analyzeTransaction(5000,"America",1234);
        bankAccount.analyzeTransaction(5000,"Pakistan",234);
    }
}
