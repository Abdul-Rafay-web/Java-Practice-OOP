package JavaPractice.Question24;

import JavaPractice.Question22.InvalidSalaryException;

public interface Loggable {
    public default void logToSystem(String username,int password){
        if (username.equalsIgnoreCase("admin") && password==1234){
            System.out.println("You have Successfully logged in");
        }else{
            throw new InvalidSalaryException("Sorry you cannot access the DashBoard");
        }
    }
}
