package JavaPractice.Q16;

public class Light extends SmartDevice implements Switchable {
    private String color;

    public Light(String name, int id, String location, String color) {
        super(name, id, location);
        this.color = color;
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
        System.out.println("Color: "+this.color);
    }

    public void changeColor(String color) {
        this.color = color;
        System.out.println("Color changed Successfully to :" + this.color);
    }
}
