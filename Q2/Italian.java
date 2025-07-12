package JavaPractice.Q2;

import java.util.ArrayList;

public class Italian extends Restaurant{
    public Italian(ArrayList<String> menu, int deliveryCharges){
        super(menu,deliveryCharges,"Italian");
    }
    @Override
    public void generateBill(){
        super.generateBill();
        System.out.println("Delivery Charges "+this.getDeliveryCharges());
    }
}
