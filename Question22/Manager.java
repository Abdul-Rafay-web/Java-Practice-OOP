package JavaPractice.Question22;

import java.util.ArrayList;

public class Manager extends Employee implements Reportable{
    private ArrayList<Developer> developers;
    private double allowance;
    public Manager(int id,String name,double salary,double allowance){
        super(id, name, salary);
        if(allowance==0 || allowance<0){
            throw new InvalidSalaryException("Allowance cannot be negative or zero");
        }
        this.allowance=allowance;
        this.developers=new ArrayList<>();
    }

    public void setDevelopers(ArrayList<Developer> developers) {
        this.developers = developers;
    }

    @Override
    public void calculateSalary() {
        this.salary+=allowance;
        System.out.println("The Salary is: "+salary);
    }

    @Override
    public void generateReport() {
        System.out.println("Manager :"+this.name);
        System.out.println("ID :"+this.id);
        System.out.println("Salary :"+this.salary);
        System.out.println("Developers: ");
        for (Developer developer:developers){
            System.out.println(developer.getName()+" | ID "+developer.getId()+" | Salary: "+developer.getSalary());
        }

    }
}
