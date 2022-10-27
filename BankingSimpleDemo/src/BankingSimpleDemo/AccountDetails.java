package BankingSimpleDemo;

import java.util.Scanner;

class AccountDetails {

    private String username;
    private String accountId;
    private String bankName;

    private long balance;

    Scanner sc = new Scanner(System.in);

    // Open an account
    public void openAccount() {

        // Create username
        System.out.println("Enter username: ");
        username = sc.next();

        // Create accountID
        System.out.println("Enter account ID: ");
        accountId = sc.next();

        // Choose bank
        System.out.println("Enter bank name: " );
        bankName = sc.next();

        // Input Balance
        System.out.println("Enter your current balance: ");
        balance = sc.nextLong();
    }

    // Display Account Details
    public void displayAccount() {

        System.out.println("Your name is: " + username);

        System.out.println("Your ID is: " + accountId);

        System.out.println("Your bank is: " + bankName);
    }

    public void deposit(){
        long amount;
        System.out.println("Enter the amount you want to deposit: ");
        amount = sc.nextLong();
        balance = balance + amount;
    }

    public void withdrawal() {
        long amount;
        System.out.println("Enter the amount you want to withdraw: ");
        amount = sc.nextLong();
        if(balance >= amount) {
            balance = balance - amount;
            System.out.println("Balance after withdrawal" + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Search for account using ID
    public boolean search(String accId) {
        if (accId.equals(accountId)) {
            displayAccount();
            return (true);
        }
        return (false);
    }
}
