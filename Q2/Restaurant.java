package JavaPractice.Q2;

import java.util.ArrayList;

public class Restaurant  {
    private ArrayList<String> menu=new ArrayList<>();
    private final int deliveryCharges;
    private String type;
public Restaurant(ArrayList<String>menu,int deliveryCharges,String type){
    this.deliveryCharges=deliveryCharges;
    this.menu=menu;
    this.type=type;
}
public void generateBill(){
    System.out.println("Food is on the way for Delivery");
}
public int getDeliveryCharges(){
    return this.deliveryCharges;
}
public String getType(){
    return this.type;
}
}
