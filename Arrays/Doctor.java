package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Doctor {
    private String name;
    private int[] schedule=new int[7];
    private int id;
    private String speciality;
    private int totalAttendance;
    public Doctor(int id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }
    public void inputAvailability(){
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<7; i++){
            System.out.println("Enter Status for day:"+(i+1)+" (0 for absent 1 for Present");
            schedule[i]=scan.nextInt();
            this.totalAttendance+=schedule[i];
        }
    }
    public int getTotalAttendance() {
        return totalAttendance;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        Doctor doctor1=new Doctor(1, "Burhan Tariq", "Brain Surgery");
        doctors.add(doctor1);
        doctor1.inputAvailability();
        Doctor doctor2=new Doctor(2, "Ali", "Heart Surgery");
        doctors.add(doctor2);
        doctor2.inputAvailability();
String mostAvailable = doctors.get(0).name;
int attendance=doctors.get(0).totalAttendance;
for (Doctor doctor : doctors) {
    if(doctor.getTotalAttendance()>attendance){
        mostAvailable=doctor.name;
    }
}
System.out.println(mostAvailable+" is Most Available");
System.out.println("Enter the day to check availability");
int day=scan.nextInt();
for(Doctor doctor : doctors){
    if(doctor.schedule[day]==1){
        System.out.println(doctor.name+" is Present");
    }
}
    }
}
