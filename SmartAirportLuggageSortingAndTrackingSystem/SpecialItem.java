package JavaPractice.SmartAirportLuggageSortingAndTrackingSystem;

import java.util.ArrayList;

public class SpecialItem extends Luggage{
    private ArrayList<String> specialItems=new ArrayList<>();
    public SpecialItem(String o,int weight,String p,boolean isFragile,ArrayList<String> specialItems){
        super(o,weight,p,isFragile);
        this.specialItems.addAll(specialItems);
    }

    @Override
    public void getLabel() {
        System.out.println("Your Items: "+specialItems+" are will be delivered to youb upon your arrival");
    }

}
