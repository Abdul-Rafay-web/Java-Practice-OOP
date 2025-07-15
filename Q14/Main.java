package JavaPractice.Q14;

public class Main {
    public static void main(String[] args){
        Car car=new Car("Alto",60);
        Boat boat=new Boat("Cruise",200);
        Plane plane=new Plane("AirBlue",150);
        car.displayDetails();
        plane.displayDetails();
        boat.displayDetails();
    }
}
