package JavaPractice.TwoDMatrices;

import java.util.Scanner;

public class Question1 {
    public void rowWise(int[][] a){
        int[][] b=new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
b[i][j]=a[i][j];
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
               System.out.print(b[i][j]);
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
        Question1 question1=new Question1();
        question1.rowWise(a);
    }
}
