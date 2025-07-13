package JavaPractice.Q5;

public class AutoScaler {
    private Server server;
    public void addServer(int usage){
        if(usage<=30){
            System.out.println("No new Servers added");
        } else if (usage>30 && usage<=70) {
            System.out.println("1 new Server Added");
        }
        else if (usage>70 && usage<=90) {
            System.out.println("2 new Servers Added");
        }else if (usage>90){
            System.out.println("Prioritizing High Performer Servers");
        }
    }
    public void removeServer(int usage){
        if(usage<=30){
            System.out.println("Idle Servers Removed");
        } else if (usage>30 && usage<=70) {
            System.out.println("Moderate Servers Removed");
        }
        else if (usage>70 && usage<=90) {
            System.out.println("High Load Servers Removed");
        }else if (usage>90){
            System.out.println("OverLoaded Servers Removed");
        }
    }
    public void setServer(Server s){
        this.server=s;
    }
    public static void main(String[] args){
        AutoScaler autoScaler=new AutoScaler();
        Server server1=new Server();
        server1.setUsage(75);
        autoScaler.addServer(server1.getUsage());
        autoScaler.removeServer(server1.getUsage());
    }
}
