package JavaPractice.Question20;

import JavaPractice.Q8.B;

import java.io.*;
import java.util.Scanner;

public class VaccinationDoses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, vaccineName;
        int dose;
        String patientWithMostDoses = "", vaccineWithMostDoses = "";
        int maxDoses = 0;
        File inputFIle=new File("vaccine_dose.txt");
        File tempFile=new File("temp.txt");
        System.out.println("Enter the Patient name");
        String newPatient = scan.nextLine();
        System.out.println("Enter the new Vaccine name");
        String newVaccine = scan.nextLine();
        System.out.println("Enter the new Doses Count");
        int newDose = scan.nextInt();
        scan.nextLine();
        try {
           BufferedWriter writer=new BufferedWriter(new FileWriter(tempFile));
            // Reading and processing file
            BufferedReader reader = new BufferedReader(new FileReader(inputFIle));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Patient") && line.contains(newPatient)){
line="Patient "+newPatient+" | Vaccine: "+newVaccine+" | Dose: "+newDose;
                }writer.write(line);
                writer.newLine();
                reader.close();
                writer.close();
            }
            }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
            if(inputFIle.delete()){
                tempFile.renameTo(inputFIle);
                System.out.println("Things updated Successfully");
            }
        }
    }
}