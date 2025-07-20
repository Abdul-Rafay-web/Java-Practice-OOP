package JavaPractice.SmartAirportLuggageSortingAndTrackingSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class AirportSystem {
    public static void main(String[] args){
        ArrayList<Luggage> luggages=new ArrayList<>();
        ArrayList<String>items=new ArrayList<>();
        items.add("Pet");
        items.add("Guitar");
        CabinBag cabinBag=new CabinBag("ALi",9,"Low",false);
        CheckIn checkIn=new CheckIn("Sohaib",13,"High",true);
        SpecialItem specialItem=new SpecialItem("Ali",6,"High",true,items);
        luggages.add(cabinBag);
        luggages.add(checkIn);
        luggages.add(specialItem);
        LuggageSlot<Luggage> luggageSlot=new LuggageSlot<>(luggages);
        luggageSlot.addDate(luggages);
        ArrayList<Luggage>luggageArrayList = new ArrayList<>();
        luggageArrayList=luggageSlot.loadData();
    }
}
