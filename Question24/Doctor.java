package JavaPractice.Question24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Doctor extends Person{
    private Medicine medicine;
    public Doctor(int id ,String name,int number,String email,String role){
        super(id, name, number, email,role);
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Medicine getMedicine() {
        return medicine;
    }
    public void readPatients(){
        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader("patient.txt"));
            String line;
            try {
                while((line=bufferedReader.readLine())!=null){
System.out.println(line);
                }
                bufferedReader.close();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Email : "+this.email);
        System.out.println("Medicine : "+medicine.getName());
    }
}
