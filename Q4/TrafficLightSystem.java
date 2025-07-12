package JavaPractice.Q4;

public class TrafficLightSystem {
    private String currentState;
    private int timer;
    public TrafficLightSystem(){
        this.currentState="Red";
        this.timer=60;
    }
    public void changeState(){
        switch (currentState){
            case "Red":
                currentState="Green";
                timer=30;
                break;
            case "Yellow":
                currentState="Red";
                timer=60;
                break;
            case "Green":
                currentState="Yellow";
                timer=5;
                break;
        }
        System.out.println("The light changed to "+currentState);
    }
    public int getTimer(){
        return this.timer;
    }
    public static void main(String[] args){
        TrafficLightSystem trafficLightSystem=new TrafficLightSystem();
        for(int i=0;i<6;i++){
            trafficLightSystem.changeState();
            try {
                Thread.sleep(trafficLightSystem.getTimer()*100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
