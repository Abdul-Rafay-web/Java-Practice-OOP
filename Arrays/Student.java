package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String  name;
    private int id;
    private int[] scores=new int[5];
    private int sum=0;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void inputScores(Scanner scan) {
        for (int i=0;i<5;i++){
            scores[i]=scan.nextInt();
            sum+=scores[i];
        }
    }
    public void displayAverageMarks() {
        double average=sum/5;
        System.out.println("Average: "+average);
    }
    public int getExamScore(int i){
        return this.scores[i];
    }
    public String getName(){
        return this.name;
    }
    public int getTotalScore(){
        return this.sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Mary", 1);
        s1.inputScores(scan);
        students.add(s1);
        Student s2 = new Student("John", 2);
        s2.inputScores(scan);
        students.add(s2);
        for(Student student : students){
            for (int i=0;i<5;i++){
                if(student.getExamScore(i)<40){
                    System.out.println(student.getName()+" has failed in Exam "+(i+1));
                }
            }
        }
        String topperStudent=students.get(0).getName();
        int topperScore=students.get(0).getTotalScore();
        for(Student student:students){
            if(student.getTotalScore()>topperScore){
                topperStudent=student.getName();
                topperScore=student.getTotalScore();
            }
        }
        System.out.println("Topper Student: "+topperStudent);
    }
}
