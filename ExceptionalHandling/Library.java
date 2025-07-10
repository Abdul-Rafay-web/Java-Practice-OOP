package JavaPractice.ExceptionalHandling;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    public Library(){
        this.books=new ArrayList<>();
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void borrowABook(String id) throws BookNotAvailableException{
for(Book b:books){
    if (b.getId().equalsIgnoreCase(id)){
        if (!b.isAvailable()){
            throw new BookNotAvailableException("Book is not Available");
        }
        System.out.println("Book "+id+" has been borrowed Successfully");
        break;
    }
}
    }
    public static void main(String[] args){
        ArrayList<Book> books=new ArrayList<>();
        books.add(new Book("Abc",true));
        books.add(new Book("cde",false));
        Library library=new Library();
        library.setBooks(books);
        try{
            library.borrowABook("Abc");
            library.borrowABook("cde");
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
