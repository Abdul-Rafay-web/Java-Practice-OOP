package Relationships;
import java.util.ArrayList;
public class Course {
    private String courseID;
    private String courseName;
    ArrayList <Student> students;
    public Course(String courseID, String courseName, ArrayList <Student> students) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.students = students;
    }
    public void displayStudents() {
        for(Student student : students) {
            student.displayStudent();
        }
    }
}
