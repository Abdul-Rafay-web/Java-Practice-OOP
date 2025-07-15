package JavaPractice.Q13;

public class Book {
    private String name;
    private String author;
    private double price;
    public Book(String name,String author,double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
public String getName(){
        return name;
    }

    public String getAuthor() {
        return author;
    }
    public void displayDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Author Name: "+this.author);
        System.out.println("Price : "+this.price);
    }
}
