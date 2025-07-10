package JavaPractice.ExceptionalHandling;

public class First {
    static int age = 7;

    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age not Allowed");
        }
    }

    public void checkEmail(String email) throws InvalidEmailException {
        char[] array = email.toCharArray();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '@') {
                found = true;
            }
        }
        if (!found) {
            throw new InvalidEmailException("Email is Invalid");
        }else {
            System.out.println("The email is: "+email);
        }
    }

    public void divisionCalculator(int a, int b) {
        int d;
        try {
            d = a / b;
            System.out.println("The Division is: " + d);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        First first = new First();
        try {
            first.checkEmail("abrafay276.gmail.com");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }try {
            first.checkEmail("abrafay276@gmail.com");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
