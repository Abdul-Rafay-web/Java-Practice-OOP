package JavaPractice.Q3;

public class Customer {
    private String name;
    private boolean previous;
    public Customer(String name){
        this.name=name;
        this.previous=false;
    }
    public boolean getPrevious(){
        return this.previous;
    }
    public void setPrevious(boolean b){
        this.previous=b;
    }
}
