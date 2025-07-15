package JavaPractice.Q14;

public class Car extends Vehicle implements Floatable {

    public Car(String name,int speed){
        super(name,speed);
    }
    @Override
    public void displayDetails() {
        Driveable.driveable();
    }
    }
