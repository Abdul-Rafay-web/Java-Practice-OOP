package Relationships;

import java.util.ArrayList;

public class University {
    private String uniName;
    private ArrayList<Department> departments;
    public University(String uniName,Department department){
        this.uniName=uniName;
        this.departments=new ArrayList<>();
        this.departments.add(department);
    }
    public void addDepartment(Department department){
        this.departments.add(department);
    }
    public void displayUniversityDetails(){
        System.out.println("University Name: "+this.uniName);
        System.out.println("Departments: ");
        for(Department department:departments){
            department.displayDepartmentDetails();
        }
    }
}
