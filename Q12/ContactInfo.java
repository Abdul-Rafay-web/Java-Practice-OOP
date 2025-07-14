package JavaPractice.Q12;

public class ContactInfo {
    private String phoneDetails;
    private String address;
    public ContactInfo(String phoneDetails,String address){
        this.address=address;
        this.phoneDetails=phoneDetails;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneDetails() {
        return phoneDetails;
    }
}
