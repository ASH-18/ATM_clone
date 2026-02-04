package atm;

public abstract class atm {

	    protected bankaccount account;

	    public atm(bankaccount account) {
	        this.account = account;
	    }

	    public abstract void checkBalance();
	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract void changePin(int oldPin, int newPin);
	}


