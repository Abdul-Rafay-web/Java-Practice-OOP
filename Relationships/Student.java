package Relationships;

public class Student {
    private String studentName;
    private int studentID;
    public Student(){
        this.studentName = "Unknown";
        this.studentID = 0;
    }
    public Student(String studentName){
        this();
        this.studentName = studentName;
    }
    public Student(String studentName, int studentID){
        this(studentName);
        this.studentID = studentID;
    }
    public void displayStudent(){
        System.out.println("Student Name: "+studentName);
        System.out.println("Student ID: "+studentID);
    }
}
