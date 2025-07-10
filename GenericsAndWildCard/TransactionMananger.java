package JavaPractice.GenericsAndWildCard;

import JavaPractice.Question23.Bank;

import java.util.ArrayList;
import java.util.List;

public class TransactionMananger {
    public void printTransaction(List<? extends Transaction> s){
        for (Transaction transaction:s){transaction.printTransaction();
        }
    }
    public static void main(String[] args){
        TransactionMananger transactionMananger=new TransactionMananger();
        CreditCardTransaction creditCardTransaction=new CreditCardTransaction();
        BankAccountTransaction bankAccountTransaction=new BankAccountTransaction();
        UPIPaymentTransaction upiPaymentTransaction=new UPIPaymentTransaction();
        ArrayList<Transaction> transactions=new ArrayList<>();
        transactions.add(creditCardTransaction);
        transactions.add(upiPaymentTransaction);
        transactions.add(bankAccountTransaction);
        transactionMananger.printTransaction(transactions);
    }
}
