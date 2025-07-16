package JavaPractice.Question19;

import javax.xml.namespace.QName;
import java.io.*;
import java.util.Scanner;

public class PSLBudget {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name;double budget;
        String line;
        String teams[]=new String[3];
        double max=0;double b;int index=0;
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("psl_budget_log.txt"));
            for(int i=0;i<3;i++){
                System.out.println("Enter the name of the team");
                name =scan.nextLine();
                bufferedWriter.write("Team Name: "+name+"\n");
                System.out.println("Enter the budget of the team");
                budget=scan.nextDouble();
                scan.nextLine();
                bufferedWriter.write("Budget: "+budget+"\n");
                System.out.println("Budget Entered Successfully");
            }bufferedWriter.close();
            BufferedReader bufferedReader=new BufferedReader(new FileReader("psl_budget_log.txt"));

            while ((line= bufferedReader.readLine())!=null){
                System.out.println(line);
                try{index++;
                    b=Double.parseDouble(line);
                    if (b>max){
                        max=b;
                    }
                } catch (NumberFormatException e) {
                }
            }index=index-4;
            System.out.println("The team with highest budget is: "+teams[index]+"| Rs. "+max);
            bufferedReader.close();
        } catch (IOException e){
            System.out.println("An error Occurred");
        }
    }
}