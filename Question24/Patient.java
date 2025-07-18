package JavaPractice.Question24;

public class Patient extends Person{
    MedicalHistory medicalHistory;
    public Patient(int id ,String name,int number,String email,String role){
        super(id, name, number, email,role);
    }
    public void setMedicalHistory(MedicalHistory medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public MedicalHistory getMedicalHistory() {
        return medicalHistory;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Email : "+this.email);
    }
}
