package StaticBlock;

public class Practice2 {
    public static void celsiusToFahrenheit(double temperature) {
        temperature=(temperature*9/5)+32;
        System.out.println(temperature);
    }
    public static void main(String[] args) {
        celsiusToFahrenheit(35);
    }
}
