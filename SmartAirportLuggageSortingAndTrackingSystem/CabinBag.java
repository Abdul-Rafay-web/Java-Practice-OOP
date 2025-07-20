package JavaPractice.SmartAirportLuggageSortingAndTrackingSystem;

public class CabinBag extends Luggage{
    public CabinBag(String ownerName,int weight,String priority,boolean isFragile){
        super(ownerName, weight, priority, isFragile);
    }

    @Override
    public void getLabel() {
        System.out.println("Your Cabin Bag is ready and will be delivered upon on your Arrival");
    }
}
