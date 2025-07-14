package JavaPractice.Q12;

import java.util.ArrayList;

public class Admin extends User{
    private String name;
    private ArrayList<User> users;
    public Admin(String name,String email){
        super(name,email);
        this.users=new ArrayList<>();
    }
    public void generateUserReport(){
        for (User u:users){
            u.performDuties();
        }
    }
}
