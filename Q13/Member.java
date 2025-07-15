package JavaPractice.Q13;

import java.util.ArrayList;

public class Member extends User{
    private int memberID;
    private ArrayList<Book> books;
    public Member(String name,String email,String pNumber,int memberID){
        super(name,email,pNumber);
        this.memberID=memberID;
        this.books=new ArrayList<>();
    }
public void issueBook(Book b){
        this.books.add(b);
        System.out.println("Book has been successfully borrowed");
}
}
