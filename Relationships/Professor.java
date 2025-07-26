package Relationships;

public class Professor {
    private String professorName;
    private String professorID;
    private Course course;
    public Professor(String professorName, String professorID) {
        this.professorName = professorName;
        this.professorID = professorID;
    }
    public void setProfessorCourse(Course course) {
        this.course = course;
    }
    public void displayProfessorDetails() {
        System.out.println("Professor Name: "+this.professorName);
        System.out.println("Professor ID:"+this.professorID);
        System.out.println("Professor Course: "+this.course);
    }
}
