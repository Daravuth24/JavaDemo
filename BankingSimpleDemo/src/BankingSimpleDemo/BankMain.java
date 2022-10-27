package BankingSimpleDemo;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create account
        System.out.println("Enter amount of customer accounts to create: ");
        int n = sc.nextInt();
        AccountDetails C[] = new AccountDetails[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new AccountDetails();
            C[i].openAccount();
        }

        int ch;

        do {
            System.out.println("\n*** Welcome to DV's Banking Service ***");
            System.out.println("1. Display account \n2. Search account ID \n3. Deposit into account \n4. Withdraw from account \n5. Exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    // Display account
                    System.out.println("Displaying account...");
                    for (int i = 0; i < C.length; i++) {
                        C[i].displayAccount();
                    }
                    break;

                case 2:
                    // Search for account using ID
                    System.out.println("Enter your account ID: ");
                    String accId = sc.next();
                    System.out.println("Searching for account...");
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(accId);
                        if (found) {
                            System.out.println("Found! Displaying info...");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("The ID you have entered is not found! Please try again with another ID.");
                    }
                    break;

                case 3:
                    // Deposit into account
                    System.out.println("Enter your account ID: ");
                    accId = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(accId);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("The ID you have entered is not found! Please try again with another ID.");
                    }
                    break;

                case 4:
                    // Withdraw from account
                    System.out.println("Enter your account ID: ");
                    accId = sc.next();
                    found = false;
                    for (int i = 0; i< C.length; i++) {
                        found = C[i].search(accId);
                        if (found) {
                            C[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("The ID you have entered is not found! Please try again with another ID.");
                    }
                    break;

                case 5:
                    // Exit from system
                    System.out.println("Thank you for using DV's banking service! Have a good day!");
                    break;

            }
        }
        while(ch != 5);

    }
}