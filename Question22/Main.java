package JavaPractice.Question22;

import JavaPractice.Q8.B;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Developer d =new Developer(211,"Ali",16500,25000);
        d.calculateSalary();
        Developer d2=new Developer(2111,"Hafeez",12321,1431);
        d2.calculateSalary();
        Manager m=new Manager(21212,"Naeem",311221,2312);
        m.calculateSalary();
        ArrayList<Developer> developers=new ArrayList<>();
        developers.add(d);
        developers.add(d2);
        m.setDevelopers(developers);
        m.generateReport();
        ArrayList<Employee> employees=new ArrayList<>();
        employees.addAll(developers);
        employees.add(m);
        try{
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("employees.txt",true));
            for (Employee employee:employees){
                bufferedWriter.write("Name: "+employee.getName()+" | ID: "+employee.getId()+" | Salary: "+employee.getSalary());
            bufferedWriter.newLine();
            }
            bufferedWriter.close();
            System.out.println("Data Entered Successfully");
        }catch (IOException e){
            e.getMessage();
        }
    }
}
