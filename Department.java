package Relationships;

import java.util.ArrayList;

public class Department {
    private String departmentName;
    private ArrayList<Professor> professors;
    public Department(String departmentName,Professor professor){
        this.departmentName=departmentName;
        this.professors=new ArrayList<>();
        this.professors.add(professor);
    }
    public Department(Department department){
        this.departmentName= department.departmentName;
        this.professors=department.professors;
    }
    public void addProfessor(Professor professor){
        this.professors.add(professor);
    }
    public void displayDepartmentDetails(){
        System.out.println("Department Name: "+this.departmentName);
        System.out.println("Professors: ");
        for (Professor professor:professors){
            professor.displayProfessorDetails();
        }
    }
}
