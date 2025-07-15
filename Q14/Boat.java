package JavaPractice.Q14;

import JavaPractice.Q8.B;

public class Boat extends Vehicle implements Floatable{
    public Boat(String name,int speed){
        super(name,speed);
    }
    @Override
    public void displayDetails(){
        Floatable.floatable();
    }
}
