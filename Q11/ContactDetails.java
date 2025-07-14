package JavaPractice.Q11;

public class ContactDetails {
    private String city;
    private int phone;
    private String email;
    public ContactDetails(String city,int phone,String email){
        this.city=city;
        this.phone=phone;
        this.email=    email;
    }

    public int getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }
}
