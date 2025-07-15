package JavaPractice.Q13;

import java.util.ArrayList;

public class Library {
    private ArrayList<Member>members;
    private ArrayList<Book>books;
    private static int totalBooksBorrowed;
    public Library(){
        this.members=new ArrayList<>();
        this.books=new ArrayList<>();
    }
    public void borrowBooks(Member m,Book b){
        boolean bookFound=false;
        boolean isMember=false;
        for (Book book:books){
            if (b.getName().equals(book.getName())){
                bookFound=true;
                for (Member member:members){
                    if (m.getName().equalsIgnoreCase(member.getName())){
                        isMember=true;
                        member.issueBook(book);
                        totalBooksBorrowed++;
                        break;
                    }
                }
            }
        }
        if (!isMember){
            System.out.println("Sorry become a Member First");
        }
        if (!bookFound){
            System.out.println("Sorry book not found");
        }
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
    public void addMember(Member m){
        this.members.add(m);
    }
    public void addBook(Book b){
        this.books.add(b);
    }
    public void availableBooks(){
        for (Book b:books){
            b.displayDetails();
        }
    }
}
