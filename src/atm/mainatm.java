package atm;
import java.util.Scanner;
public class mainatm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bankaccount account = new bankaccount(1000);
		atmservice atm = new atmservice(account);

	        System.out.println("===== WELCOME TO ATM =====");

	        // PIN setup
	        if (account.getPin() == -1) {
	            System.out.print("Set your 4-digit PIN: ");
	            account.setPin(sc.nextInt());
	            System.out.println("PIN set successfully!");
	        }

	        // PIN validation
	        System.out.print("Enter your PIN: ");
	        int enteredPin = sc.nextInt();

	        if (enteredPin != account.getPin()) {
	            System.out.println("Invalid PIN. Access denied.");
	            return;
	        }

	        int choice;
	        do {
	            System.out.println("\n---- ATM MENU ----");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Change PIN");
	            System.out.println("5. Logout");
	            System.out.print("Enter your choice: ");

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
	                    System.out.print("Enter old PIN: ");
	                    int oldPin = sc.nextInt();
	                    System.out.print("Enter new PIN: ");
	                    int newPin = sc.nextInt();
	                    atm.changePin(oldPin, newPin);
	                    break;

	                case 5:
	                    System.out.println("Logged out successfully. Thank you!");
	                    break;

	                default:
	                    System.out.println("Invalid option!");
	            }
	        } while (choice != 5);

	        sc.close();
	    }
	}


