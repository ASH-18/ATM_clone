package atm;
public class atmservice extends atm {

	    public atmservice(bankaccount account) {
	        super(account);
	    }

	    @Override
	    public void checkBalance() {
	        System.out.println("Current Balance: ₹" + account.getBalance());
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            account.setBalance(account.getBalance() + amount);
	            System.out.println("₹" + amount + " deposited successfully.");
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= account.getBalance()) {
	            account.setBalance(account.getBalance() - amount);
	            System.out.println("₹" + amount + " withdrawn successfully.");
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	    }

	    @Override
	    public void changePin(int oldPin, int newPin) {
	        if (account.getPin() == oldPin) {
	            account.setPin(newPin);
	            System.out.println("PIN changed successfully.");
	        } else {
	            System.out.println("Incorrect old PIN.");
	        }
	    }
	}


