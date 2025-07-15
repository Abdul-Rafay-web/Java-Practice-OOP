package JavaPractice.Q13;

public class User {
    protected String name;
    protected String email;
    protected String pNumber;
    public User(String name,String email,String pNumber){
        this.name=name;
        this.email=email;
        this.pNumber=pNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getpNumber() {
        return pNumber;
    }
}
