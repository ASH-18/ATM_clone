package atm;

import java.util.Scanner;

public class mainatm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== WELCOME TO ATM =====");

        // 🔹 ACCOUNT CREATION
        System.out.print("Set your password: ");
        String password = sc.nextLine();

        bankaccount account = new bankaccount(1000, password);
        atmservice atm = new atmservice(account);

        System.out.println("Your Account Number: " + account.getAccountNumber());

        // 🔹 AUTHENTICATION (ONCE)
        System.out.print("Enter password to login: ");
        String enteredPassword = sc.nextLine();

        if (!account.validatePassword(enteredPassword)) {
            System.out.println("Authentication failed. Exiting.");
            return;
        }

        System.out.println("Login successful!");

        // 🔹 SESSION STARTS
        int choice;
        do {
            System.out.println("\n---- ATM MENU ----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change Password");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    atm.deposit(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    atm.withdraw(sc.nextDouble());
                    break;

                case 4:
                    sc.nextLine(); // consume newline
                    System.out.print("Enter new password: ");
                    atm.changePassword(sc.nextLine());
                    break;

                case 5:
                    System.out.println("Session ended. Thank you!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 5);

        sc.close();
    }
}