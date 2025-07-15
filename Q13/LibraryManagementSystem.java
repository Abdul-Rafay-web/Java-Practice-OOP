package JavaPractice.Q13;

public class LibraryManagementSystem {
public static void main(String[]args){
    User[] users=new User[2];
    Member member1=new Member("Ali","ali@nu.com","1212312",3012);
    Member member2=new Member("Saad","saad@nu.edu.pk","21312132",3041);
    users[0]=member1;
    users[1]=member2;
    Book book1=new Book("A brief History of Time","Stephen Hawking",270.5);
    Book book2=new Book("Al Chemist","Paulo Cohelo",1000);
    Library library=new Library();
    library.addBook(book1);
    library.addBook(book2);
    library.addMember(member1);
    library.borrowBooks(member2,book2);
    library.addMember(member2);
    library.borrowBooks(member2,book2
    );
}
}
