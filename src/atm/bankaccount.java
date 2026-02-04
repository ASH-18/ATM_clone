package atm;

public class bankaccount {

    private long accountNumber;
    private double balance;
    private String password;

    public bankaccount(double balance, String password) {
        this.accountNumber = generateAccountNumber();
        this.balance = balance;
        this.password = password;
    }

    // 🔹 RANDOM ACCOUNT NUMBER (NO Random CLASS)
    private long generateAccountNumber() {
        return System.currentTimeMillis(); // unique & dynamic
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean validatePassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }
}