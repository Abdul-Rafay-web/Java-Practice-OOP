package JavaPractice.TwoDMatrices;

import java.util.Scanner;

public class Question2 {
    public void columnWise(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[j][i]);
            }
        }
    }
    public static void main(String[]args){
        int[][] a=new int[2][2];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println("Enter number for row "+i+" and column "+j);
                a[i][j]= scan.nextInt();
            }
        }
        Question2 question2=new Question2();
        question2.columnWise(a);
    }
}
