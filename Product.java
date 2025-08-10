package Inheritance;

public class Product{
    private String name;
    private double price;
    public Product(String name, double price){
        this.name=name;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}
class Electronic extends Product{
    private int warrantyPeriod;
    public Electronic(String name,double price, int warrantyPeriod){
        super(name,price);
        this.warrantyPeriod=warrantyPeriod;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Warranty Period: "+warrantyPeriod);
    }
}
class Clothing extends Product{
    private String size;
    public Clothing(String name,double price, String size){
        super(name,price);
        this.size=size;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Size: "+size);
    }
}
class ProductMain{
    public static void main(String[] args) {
        Product product1=new Electronic("Philips",5000,2);
        product1.displayDetails();
        Product product2=new Clothing("J.",2500,"Large");
        product2.displayDetails();
    }
}