package JavaPractice.Q14;

public class Plane extends Vehicle implements Flyable {
    public Plane(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayDetails() {
        Flyable.flyable();

    }
}