package JavaPractice.Q3;

import java.util.ArrayList;

public class RentalSystem {
    private ArrayList<Car> cars=new ArrayList<>();
    private ArrayList<Customer> customers=new ArrayList<>();
    public void addCar(Car c){
        cars.add(c);
    }
    public void rentACar(int hours,String type,Customer customer){
        boolean found=false;
        for(Car c:cars){
            if (c.getType().equalsIgnoreCase(type)){
                found=true;
                if (c.getAvailability()) {
                    System.out.println("Car is successfully Rented");
                    if (customer.getPrevious()) {
                        double bill = c.generateBill(hours) * 0.1;
                        System.out.println("The bill will be " + bill);
                    } else {
                        double bill = c.generateBill(hours);
                        System.out.println("The bill will be " + bill);
                        c.setAvailability(true);
                    }
                }else{
                    System.out.println("Sorry Car not Available");
                }
            }
        }
        if (!found){
            System.out.println("Car not found");
        }
    }
    public static void main(String[]args){
        RentalSystem rentalSystem=new RentalSystem();
        SUV suv=new SUV("WagonR","X2FF4",5000);
        Economy economy=new Economy("Alto","FFU23",1500);
        Luxury luxury=new Luxury("Land Cruiser","we23",10000);
        suv.setAvailability(true);
        economy.setAvailability(false);
        luxury.setAvailability(true);
        rentalSystem.addCar(suv);
        rentalSystem.addCar(economy);
        rentalSystem.addCar(luxury);
        Customer c=new Customer("Naeem");
        rentalSystem.rentACar(3,"Luxury",c);
        rentalSystem.rentACar(5,"SUV",c);
        rentalSystem.rentACar(10,"Economy",c);
    }
}
