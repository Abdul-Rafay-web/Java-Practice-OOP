package JavaPractice.Question28;

import java.util.Arrays;

public class Customer {
    private int id;
    private String name;
    private Account[] accounts;
    private static int counter;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
        counter++;
    }

    public void addAccount(Account acc) {
        accounts[counter]=acc;
        counter++;
    }
    public Account[] getAccounts(){
        return accounts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
