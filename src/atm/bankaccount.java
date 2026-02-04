package atm;

public class bankaccount {

	    private double balance;
	    private int pin;

	    public bankaccount(double balance) {
	        this.balance = balance;
	        this.pin = -1; // pin not set
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public int getPin() {
	        return pin;
	    }

	    public void setPin(int pin) {
	        this.pin = pin;
	    }
	}

