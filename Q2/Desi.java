package JavaPractice.Q2;

import java.util.ArrayList;

public class Desi extends Restaurant{
        public Desi(ArrayList<String> menu, int deliveryCharges){
            super(menu,deliveryCharges,"Desi");
        }
        @Override
        public void generateBill(){
            super.generateBill();
            System.out.println("Delivery Charges "+this.getDeliveryCharges());
        }
    }

