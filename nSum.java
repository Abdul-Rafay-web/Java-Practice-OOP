package Recursion;

public class nSum {
    public void printSum(int n,int i,int sum){
        if(i==n){
            sum+=i;
            System.out.println("The Sum till "+n+" numbers is: "+sum);
            return;
        }
        sum+=i;
        printSum(n,++i,sum);
    }
    public static void main(String[] args){
        nSum nSum=new nSum();
        nSum.printSum(5,1,0);
    }
}
