package JavaPractice.Q18;

public class TryCatch {
    public void formatChange(String array){
        try{
            int a=Integer.parseInt(array);
            System.out.println(a);
        }catch (NumberFormatException numberFormatException){
            System.out.println("Invalid Number Format");
        }
    }
    public static void main(String[] args){
       TryCatch tryCatch=new TryCatch();
       String array="5";
       tryCatch.formatChange(array);
       String array2="abc";
       tryCatch.formatChange(array2);
    }
}
