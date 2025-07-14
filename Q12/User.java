package JavaPractice.Q12;

public class User {
    protected String email;
    protected String name;
    protected static int userCount;
    protected ContactInfo contactInfo;
    public User(String name,String email){
        this.email=email;
        this.name=name;
        userCount++;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
    public void performDuties(){
        System.out.println("You have Duties: ");
    }
}
