package JavaPractice.TwoDMatrices;

import java.util.Scanner;


public class Question5 {
    public void spiralMatrix(int[][] a) {
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
        for(int i=1;i<col-2;i++){
            System.out.print(a[1][i]+" ");
        }
        for (int i=col-3;i>1;i--){
            System.out.print(a[2][i]+" ");
        }
    }
    public static void main(String[] args){
        Question5 question5=new Question5();
        //[[1,2,3,4]       [[1,2,3],
        // [5,6,7,8]        [4,5,6],
        // [9,10,11,12]     [7,8,9]]
        // [13,14,15,16]]
        int[][] a=new int[4][4];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println("Enter number for row "+i+" and column "+j);
                a[i][j]= scan.nextInt();
            }
        }
        question5.spiralMatrix(a);
    }
}
