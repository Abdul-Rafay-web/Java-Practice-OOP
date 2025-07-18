package JavaPractice.Question24;

import JavaPractice.Q8.A;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HospitalDatabase <T extends Person>{
     ArrayList<T> people=new ArrayList<>();
     ArrayList<T>patients=new ArrayList<>();
     public HospitalDatabase(){
         this.people=new ArrayList<>();
         this.patients=new ArrayList<>();
     }

    public void setPeople(ArrayList<T> people) {
        this.people = people;
    }

    public void setPatients(ArrayList<T> patients) {
        this.patients = patients;
    }

    public void removePerson(int id){
         boolean found=false;
         for (T p:people){
             if (p.getId()==id){
                 found=true;
                 p.displayDetails();
                 break;
             }
         }
         if (!found){
             System.out.println("Person with ID: "+id+" not found");
         }
    }
    public void addDetailsToFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("patient.txt", true));
            for (T p : patients) {
                if (p instanceof Patient) {
                    Patient pt = (Patient) p;
                    bufferedWriter.write("Name: " + pt.getName() + " | ID: " + pt.getId() + " | Phone Number: " + pt.getNumber() + " | Email: " + pt.getEmail());
                    bufferedWriter.newLine();
                    bufferedWriter.write(" Prescription ");
                    bufferedWriter.newLine();

                    // ISSUE 4: You're not checking if medicalHistory is null
                    // Fix: Add null check
                    if (pt.getMedicalHistory() != null) {
                        bufferedWriter.write(" Medicine: " + pt.getMedicalHistory().getMedicine().getName());
                        bufferedWriter.newLine();
                        bufferedWriter.write(" Usage: " + pt.getMedicalHistory().getPrescription().getUsage());
                    } else {
                        bufferedWriter.write(" No medical history available");
                    }
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("An error Occurred: " + e.getMessage());
        }
    }

}
