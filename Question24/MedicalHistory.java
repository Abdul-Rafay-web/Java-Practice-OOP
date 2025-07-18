package JavaPractice.Question24;

import java.util.MissingResourceException;

public class MedicalHistory {
    private Medicine medicine;
    private Prescription prescription;
    public MedicalHistory(Medicine medicine,Prescription prescription){
        this.medicine=medicine;
        this.prescription=prescription;
    }
public void displayDetails(){
        System.out.println("Medicine :"+medicine.getName());
    System.out.println("Prescription" );
    System.out.println("Usage :"+prescription.getUsage());
}
    public Medicine getMedicine() {
        return medicine;
    }

    public Prescription getPrescription() {
        return prescription;
    }
}
