package BankingSimpleDemo;

public class BankMain {

    public static void main(String[] args){

        UserAccount customer1 = new UserAccount(); // Create an account object
        customer1.deposit(500);

        // Create customer2
        UserAccount customer2 = new UserAccount();
        customer2.withdrawal(400);

        System.out.println("Customer1 has a balance of: ");
        System.out.println(customer1.getUserBalance());

        System.out.println("Customer2 has a balance of: ");
        System.out.println(customer2.getUserBalance());
    }

}
