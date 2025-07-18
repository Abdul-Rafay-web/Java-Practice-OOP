package JavaPractice.Question26;

import java.io.*;

public class Main {
    public static void main(String[] args){

            try{
                BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("employees3.txt",true));
                bufferedWriter.write("Name: Abdul Rafay Tariq "+"| ID: "+1234+" | Salary: "+2455666);
                bufferedWriter.newLine();
                bufferedWriter.write("Name Abdul Rafay Tariq "+"| ID: "+1234+" | Salary: "+2455666);
                bufferedWriter.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }

        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader("employees3.txt"));
        }catch(FileNotFoundException e){
            System.out.print(e.getMessage());
        }
        }
    }

