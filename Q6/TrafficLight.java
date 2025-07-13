package JavaPractice.Q6;

public class TrafficLight {
    private String currentSignal;
    private int greenLightDuration;
    private String adjacentSignal;
    public TrafficLight(String currentSignal,int greenLightDuration){
        this.currentSignal=currentSignal;
        this.greenLightDuration=greenLightDuration;
    }
    public void analyzeTrafficFlow(int carsPerMinute){
        if(carsPerMinute<=10){
            this.changeLightTime(30);

            System.out.println("The duration of signal is now 30s");
        } else if (carsPerMinute>10 && carsPerMinute<=30) {
            this.changeLightTime(45);

            System.out.println("The duration of signal is now 45s");
        }else if (carsPerMinute>30){
            this.changeLightTime(60);
            this.adjacentSignal="Red";
            System.out.println("The duration of signal is now 60s and Adjacent road Signal is now Red");
        }
    }
    public void changeLightTime(int time){
        this.greenLightDuration=time;
    }
    public static void main(String[] args){
        TrafficLight trafficLight=new TrafficLight("Green",30);
        trafficLight.analyzeTrafficFlow(40);
    }
}
