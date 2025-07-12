package JavaPractice.Q2;

import java.util.ArrayList;

public class FastFood extends Restaurant{
    public FastFood(ArrayList<String> menu,int deliveryCharges){
        super(menu,deliveryCharges,"Fast Food");
    }
    @Override
    public void generateBill(){
        super.generateBill();
        System.out.println("Delivery Charges "+this.getDeliveryCharges());
    }
}
