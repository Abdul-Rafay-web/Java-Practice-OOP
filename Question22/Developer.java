package JavaPractice.Question22;

public class Developer extends Employee{
    private double bonus;
    public Developer(int id,String name,double salary,double bonus){
        super(id,name,salary);
        if(bonus==0 || bonus<0){
            throw new InvalidSalaryException("Bonus cannot be negative or zero");
        }
        this.bonus=bonus;
    }
    @Override
    public void calculateSalary(){
        this.salary+=bonus;
        System.out.println("The Salary is :"+salary);
    }
}
