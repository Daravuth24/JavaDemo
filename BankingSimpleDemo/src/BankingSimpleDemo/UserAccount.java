package BankingSimpleDemo;

import java.lang.reflect.AccessibleObject;

public class UserAccount {

    private double UserBalance;

    // Set balance to 0.00
    public UserAccount() {
        UserBalance = 0.0;
    }

    // Deposit
    public void deposit(double amount) {
        UserBalance = UserBalance + amount;
    }

    // Withdrawal
    public void withdrawal(double amount) {
        if(amount <= UserBalance) {
            UserBalance = UserBalance - amount;
        }
        else {
            System.err.println("Transaction cancelled due to insuffient funds");
        }
    }

    // Get Balance
    public double getUserBalance() {
        return UserBalance;
    }

}
