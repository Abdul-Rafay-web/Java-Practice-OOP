package StaticBlock;

public class Practice1 {
    private static int counter;
    static {
        counter = 5;
    }
    public static void main(String[] args) {
        System.out.println(counter);
    }
}
