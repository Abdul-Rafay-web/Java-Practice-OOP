package JavaPractice.Question24;

import javax.print.Doc;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Person> people=new ArrayList<>();
        ArrayList<Person> patients=new ArrayList<>();
        Doctor doctor=new Doctor(123,"Ali",1234456666,"sasdas","Doctor");
        Nurse nurse=new Nurse(234,"Farzana",121322543,"asdqeqf","Nurse");
        Patient patient=new Patient(231432,"Fatima",3243214,"dsadassa","Patient");
        Pharmacist pharmacist=new Pharmacist(21314,"Naeema",43243,"advsfd","Pharmacist");
        Medicine medicine=new Medicine("Panadol");
        Prescription prescription=new Prescription("Two Times A Day",medicine);
        MedicalHistory medicalHistory =new MedicalHistory(medicine,prescription);
        patient.setMedicalHistory(medicalHistory);
        doctor.setMedicine(medicine);
        people.add(doctor);
        people.add(patient);
        people.add(nurse);
        people.add(pharmacist);
        patients.add(patient);
        HospitalDatabase hospitalDatabase=new HospitalDatabase<>();
        hospitalDatabase.setPeople(people);
        hospitalDatabase.setPatients(patients)
        ;
        hospitalDatabase.addDetailsToFile();
        doctor.readPatients();
    }
}
