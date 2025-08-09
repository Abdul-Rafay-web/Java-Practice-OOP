package Recursion;

public class factorial {
    public void nfactorial(int n,int product){
        if(n==1 || n==0){
            System.out.println("THe Factorial of the numbers till "+n + " is "+product);
            return;
        }
        nfactorial(n-1,product*n);
    }
    public static void main(String[] args){
        factorial factorial=new factorial();
        factorial.nfactorial(5,1);
    }
}
