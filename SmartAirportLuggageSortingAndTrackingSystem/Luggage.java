package JavaPractice.SmartAirportLuggageSortingAndTrackingSystem;

public abstract class Luggage {
    protected int weight;
    protected String priority;
    protected String ownerName;
    protected boolean isFragile;
    public Luggage(String ownerName,int weight,String priority,boolean isFragile){
        this.weight=weight;
        this.ownerName=ownerName;
        this.isFragile=isFragile;
        this.priority=priority;
    }
    public abstract void getLabel();

    public boolean isFragile() {
        return isFragile;
    }

    public int getWeight() {
        return weight;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getPriority() {
        return priority;
    }
}
