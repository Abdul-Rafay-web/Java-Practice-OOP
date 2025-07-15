package JavaPractice.Q16;

public class Thermostat extends SmartDevice implements Switchable {
    private int temperature;

    public Thermostat(String name, int id, String location, int temperature) {
        super(name, id, location);
        this.temperature = temperature;
    }

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void turnOn() {
        if (!isOn()) {
            this.on = true;
            System.out.println("The Device has been turned On");
        } else {
            System.out.println("The Device is already turned On");
        }
    }

    public void turnOff() {
        if (isOn()) {
            this.on = false;
            System.out.println("The Device has been turned Off");
        } else {
            System.out.println("The Device is already turned Off");
        }
    }

    @Override
    public void getStatus() {
        System.out.println("Status: "+this.on);
        System.out.println("Temperature: "+this.temperature);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature Set to :" + this.temperature);
    }
}
