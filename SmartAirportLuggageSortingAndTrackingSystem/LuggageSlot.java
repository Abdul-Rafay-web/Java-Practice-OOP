package JavaPractice.SmartAirportLuggageSortingAndTrackingSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LuggageSlot<T extends Luggage> implements Serializable {
    private static String fileName="luggage.txt";
    private ArrayList<T> luggageList=new ArrayList<>();
    public LuggageSlot(ArrayList<T> luggageList){
        this.luggageList.addAll(luggageList);
    }
    public void addDate(ArrayList<T> luggageList){
        try{
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(fileName));
            objectOutputStream.writeObject(fileName);
            System.out.println("Luggage Added Successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<T> loadData(){
        try{ File file=new File("luggage.txt");
            if (!file.exists()){
                return new ArrayList<>();
            }
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file));
                ArrayList<T> luggage=new ArrayList<>();
                luggage=(ArrayList<T>) objectInputStream.readObject();
                return luggage;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }
    public void transferLuggage(List<? super T>dest,List<? extends T>src){
        dest.addAll(src);
        System.out.println("Luggage Transfered Successfully");
    }
    public void deleteLuggage(String ownerName){
        boolean deleted=false;
        for (T t:luggageList){
            if (t.getOwnerName().equalsIgnoreCase(ownerName)){
                luggageList.remove(t);
                deleted=true;
                break;
            }
        }
        addDate(luggageList);
    }
}
