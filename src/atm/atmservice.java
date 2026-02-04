package atm;

public class atmservice extends atm {

    public atmservice(bankaccount account) {
        super(account);
    }

    @Override
    public void checkBalance() {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: ₹" + account.getBalance());
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
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
        // ❌ Not used anymore
    }

    // ✅ NEW
    public void changePassword(String newPassword) {
        account.changePassword(newPassword);
        System.out.println("Password changed successfully.");
    }
}