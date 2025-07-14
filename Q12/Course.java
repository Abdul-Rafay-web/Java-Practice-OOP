package JavaPractice.Q12;

public class Course {
    private String courseName;
    private int grade;
    public Course(String courseName,int grade){
        this.courseName=courseName;
        this.grade=grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int marks){
        this.grade=marks;
    }
}
