package JavaPractice.Q12;

import java.util.ArrayList;

public class Student extends User{
    private ArrayList<Course> courses;
    public Student(String name,String email){
        super(name,email);
        this.courses=new ArrayList<>();
    }
    @Override
    public void performDuties(){
        super.performDuties();
        System.out.println("1.Do Assignments Timely \n2.Focus on Studies");
    }
    public void enrollCourse(Course c){
        courses.add(c);
    }
}
