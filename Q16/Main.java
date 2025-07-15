package JavaPractice.Q16;

public class Main {
    public static void main(String[] args){
        SmartDevice[] smartDevices=new SmartDevice[3];
        Light light=new Light("Phillips",123,"Karachi","Yellow");
        Fan fan=new Fan("Pak Fans",324,"Karachi",2);
        Thermostat thermostat=new Thermostat("Asia",213,"Pindi",23);
        light.changeColor("Blue");
        fan.increaseSpeed(2);
        thermostat.setTemperature(26);
        smartDevices[0]=light;
        smartDevices[1]=fan;
        smartDevices[2]=thermostat;
        for (SmartDevice s:smartDevices){
            s.getStatus();
        }
    }
}
