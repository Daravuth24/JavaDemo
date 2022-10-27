package BankingSimpleDemo;

import java.util.Scanner;

class AccountDetails {

    private String username;
    private String accountId;
    private String bankName;

    Scanner sc = new Scanner(System.in);

    // Open an account
    public void openAccount() {

        username = sc.next();

        accountId = sc.next();

        bankName = sc.next();

    }
    // Display Account Details
    public void displayAccount() {

        System.out.println(username);

        System.out.println(accountId);

        System.out.println(bankName);
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
