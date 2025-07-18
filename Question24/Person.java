package JavaPractice.Question24;

public abstract class Person implements Loggable{
    protected String name;
    protected int id;
    protected int number;
    protected String email;
    protected String role;
    public Person(int id,String name,int number,String email,String role){
this.role=role;
        this.id=id;
        this.name=name;
        this.number=number;
        this.email=email;
    }

    public String getRole() {
        return role;
    }

    public int getNumber() {
        return number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public abstract void displayDetails();
}
