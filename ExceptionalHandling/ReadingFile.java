package JavaPractice.ExceptionalHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(new File("data.txt"));
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
        }
    }
}
