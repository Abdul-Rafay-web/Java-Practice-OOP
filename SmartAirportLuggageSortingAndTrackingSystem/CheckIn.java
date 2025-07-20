package JavaPractice.SmartAirportLuggageSortingAndTrackingSystem;

public class CheckIn extends Luggage{
    public CheckIn(String o,int w,String p,boolean isFragile){
        super(o,w,p,isFragile);
    }

    @Override
    public void getLabel() {
        System.out.println("Your Check In Bag is Delivered to the Cargo");
    }
}
