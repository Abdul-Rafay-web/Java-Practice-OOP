package JavaPractice.Q14;

public abstract class Vehicle {
    protected int speed;
    protected final String name;
    public Vehicle(String name,int speed){
        this.name=name;
        this.speed=speed;
    }
    public  void displayDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Speed: "+this.speed);
    }
}
