package JavaPractice.Q16;

public class Fan extends SmartDevice implements Switchable{
    private int speed;
    public Fan(String name,int id,String location,int speed){
        super(name,id,location);
        this.speed=speed;
    }

    @Override
    public boolean isOn() {
        return false;
    }
    @Override
    public void turnOn() {
        if (!isOn()) {
            this.on=true;
            System.out.println("The Device has been turned On");
        }else{
            System.out.println("The Device is already turned On");
        }
    }
    public void turnOff() {
        if (isOn()) {
            this.on=false;
            System.out.println("The Device has been turned Off");
        }else{
            System.out.println("The Device is already turned Off");
        }
    }

    @Override
    public void getStatus() {
        System.out.println("Status: "+this.on);
        System.out.println("Speed: "+this.speed);
    }
    public void increaseSpeed(int speed){
        this.speed+=speed;
        if (this.speed>7){
            this.speed=7;
            System.out.println("Speed Increased Successfully, Current Speed: "+this.speed);
        }else {
            System.out.println("Speed Increased Successfully, Current Speed: "+this.speed);
        }
    }
}
