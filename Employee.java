package Inheritance;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
    class Manager extends Employee {
        private String department;
        public Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }
     @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Department: " + department);
     }
    }
    class Developer extends Employee {
    String programmingLanguage;
    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
        public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
    }
    class EmployeeDemo{
    public static void main(String[] args) {
        Employee employee=new Employee("Abdul Rafay",25000000);
        employee.displayDetails();
        Developer developer=new Developer("Abdul Rafay Tariq",25000000,"Java");
        developer.displayDetails();
    }
    }
