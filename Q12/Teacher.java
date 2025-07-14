package JavaPractice.Q12;

import java.util.ArrayList;

public class Teacher extends User{
    private ArrayList<String>subjects;
    public Teacher(String name,String email){
        super(name,email);
        this.subjects=new ArrayList<>();
    }
    public void addSubject(String s){
        this.subjects.add(s);
    }
    public void assignGrade(Student s,Course c,int grade){
        c.setGrade(grade);
    }
}
