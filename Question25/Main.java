package JavaPractice.Question25;

import JavaPractice.Q8.B;

import javax.tools.DiagnosticListener;
import java.io.*;

public class Main {
    public static void main(String[] args){
        try{
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("employees1.txt",true));
            bufferedWriter.write("Name: Abdul Rafay Tariq "+"| ID: "+1234+" | Salary: "+2455666);
            bufferedWriter.newLine();
            bufferedWriter.write("Name Abdul Rafay Tariq "+"| ID: "+1234+" | Salary: "+2455666);
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader("employees1.txt"));
            String line;
            String[] parts;String[] salarySplit;
            String strS;
            double s;
            try {
                while ((line = bufferedReader.readLine()) != null){
try{
    parts=line.split("|");
    if (parts.length<3){
        throw new InvalidSalaryException("Invalid Formatting Skipping Line");
    }
    strS=parts[2].trim();
    salarySplit=strS.split(":");
    if (salarySplit.length<2){
        throw new JavaPractice.Question25.InvalidSalaryException("Invalid Salary Format");
    }
    s=Double.parseDouble(salarySplit[1].trim());
    System.out.println("Salary: "+s);
}catch (NumberFormatException |JavaPractice.Question25.InvalidSalaryException e){
    System.out.println(e.getMessage());
                    }
                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
