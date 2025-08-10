package Recursion;

public class xToThePowerN {
    public int calculate(int x,int n){
        if (n==0){
            return 1;
        }
       return x*calculate(x,n-1);
    }
    public static void main(String[] args){
        xToThePowerN x=new xToThePowerN();
       int n= x.calculate(3,4);
       System.out.println("THe product is: "+n);
    }
}
