package JavaPractice.Question22;

public abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;
    public Employee(int id,String name,double salary){
        this.id=id;
        this.salary=salary;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public abstract void calculateSalary();
}
