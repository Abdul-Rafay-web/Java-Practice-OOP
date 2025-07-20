package JavaPractice.TwoDMatrices;

import java.util.Scanner;

public class Question3 {
    public void borderWise(int[][] a){
        int row=a.length;
        int col=a[0].length;
        for(int i=0;i<row;i++){
            System.out.print(a[0][i]+" ");
        }
        for(int i=1;i<col;i++){
            System.out.print(a[i][col-1]+" ");
        }
        for(int i=col-2;i>=0;i--){
            System.out.print(a[row-1][i]+" ");
        }
        for(int i=col-2;i>0;i--){
            System.out.print(a[i][0]+" ");
        }
    }
    public static void main(String[] args){
        Question3 question3=new Question3();
        //[[1,2,3,4,5]
        // [6,7,8,9,10]
        // [11,12,13,14,15]
        // [16,17,18,19,20],
        //[21,22,23,24,25]
        int[][] a=new int[5][5];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println("Enter number for row "+i+" and column "+j);
                a[i][j]= scan.nextInt();
            }
        }
        question3.borderWise(a);
    }
}
