package JavaPractice.Question24;

import java.util.ArrayList;

public class Nurse extends Person{
    private ArrayList<Patient> patients;
    public Nurse(int id ,String name,int number,String email,String role){
        super(id, name, number, email,role);
        this.patients=new ArrayList<>();
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Email : "+this.email);
    }
}
