package JavaPractice.Q2;

import java.util.ArrayList;

public class DeliveryService {
    private ArrayList<Restaurant>restaurants=new ArrayList<>();
    public void assignRestaurant(String type) {
        for (Restaurant r : restaurants) {
            if (r.getType().equalsIgnoreCase(type)) {
                r.generateBill();
            }
        }
    }
    public void addRestaurant(Restaurant r){
        restaurants.add(r);
    }
    public static void main(String[] args){
        DeliveryService d=new DeliveryService();
        ArrayList<String> menuFastFood=new ArrayList<>();
        menuFastFood.add("Chicken Karahi");
        menuFastFood.add("Chicken Tikka");
        menuFastFood.add("Aloo Paratha");
        FastFood fastFood1=new FastFood(menuFastFood,250);
        ArrayList<String>menuItalian=new ArrayList<>();
        menuItalian.add("Pasta");
        menuItalian.add("Pizza");
        Italian italian=new Italian(menuItalian,500);
        d.addRestaurant(fastFood1);
        d.addRestaurant(italian);
        d.assignRestaurant("Fast Food");
        d.assignRestaurant("Italian");
    }
}
