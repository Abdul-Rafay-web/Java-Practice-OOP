import java.util.Random;
import java.util.Scanner;

public class RandomWord {
    public void shuffle(Object[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = random.nextInt(i + 1);
            Object swap = a[i];
            a[i] = a[r];
            a[r] = swap;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter spaced Words or numbers");
        String line = scanner.nextLine();
        String a[] = line.split(" ");
        RandomWord randomWord = new RandomWord();
        randomWord.shuffle(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
