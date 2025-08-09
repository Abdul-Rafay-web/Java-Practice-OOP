import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String n1= scanner.next();
        String n2=scanner.next();
        System.out.println("Hello "+n1+" and "+n2);
        System.out.println("Goodbye "+n2+" and "+n1);

    }
}
