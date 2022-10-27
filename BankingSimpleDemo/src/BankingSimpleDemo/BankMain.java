package BankingSimpleDemo;

import java.sql.SQLOutput;

public class BankMain {

    public static void main(String[] args){

        UserAccount customer1 = new UserAccount(); // Create an account object
        customer1.deposit(500);

        // Create customer2
        UserAccount customer2 = new UserAccount();
        customer2.deposit(100);

        System.out.println(customer1.getUserBalance());
        System.out.println(customer2.getUserBalance());
    }

}
