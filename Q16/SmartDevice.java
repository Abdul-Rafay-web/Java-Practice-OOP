package JavaPractice.Q16;

public abstract class SmartDevice {
    protected int id;
    protected String name;
    protected String location;
    protected boolean on;

    public SmartDevice(String name, int id, String location) {
        this.name = name;
        this.id = id;
        this.location = location;
    }

    public abstract void  turnOn();
    public abstract void turnOff();

    public abstract void getStatus();

    public boolean isOn() {
        return on;
    }
}
