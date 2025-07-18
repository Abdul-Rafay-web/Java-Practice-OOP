package JavaPractice.Question24;

public class Pharmacist extends Person{
    private Prescription prescription;
    public Pharmacist(int id,String name,int number,String email,String role){
        super(id,name,number,email,role);
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
    public void prescriptionStatus(boolean status){
        this.prescription.setStatus(status);
    }
    @Override
    public void displayDetails() {
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Email : "+this.email);
        System.out.println("Medicine : "+prescription.getMedicine());
        System.out.println("Usage: "+prescription.getUsage());
    }
}
