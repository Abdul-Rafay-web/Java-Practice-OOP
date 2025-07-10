package JavaPractice.ExceptionalHandling;

public class Book {
    private boolean isAvailable;
    private String id;
    public Book(String id,boolean isAvailable){
        this.id=id;
        this.isAvailable=isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getId() {
        return id;
    }
}
