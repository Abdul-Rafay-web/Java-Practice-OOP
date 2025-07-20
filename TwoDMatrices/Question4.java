package JavaPractice.TwoDMatrices;

import java.util.Scanner;

public class Question4 {
    public void zigzagTraversal(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a[0].length; j++) {
                    System.out.print(a[i][j]);
                }
            } else {
                for (int j = a[0].length - 1; j >= 0; j--) {
                    System.out.print(a[i][j]);
                }
            }
        }
    }
    public static void main(String[] args){
        Question4 question4=new Question4();
        //[[1,2,3,4]       [[1,2,3],
        // [5,6,7,8]        [4,5,6],
        // [9,10,11,12]     [7,8,9]]
        // [13,14,15,16]]
        int[][] a=new int[3][3];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println("Enter number for row "+i+" and column "+j);
                a[i][j]= scan.nextInt();
            }
        }
        question4.zigzagTraversal(a);
    }
}
