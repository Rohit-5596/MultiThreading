
public class AccountUser extends Thread {

	boolean operation;
	Account account;
	float amt;
	public AccountUser(boolean operation, Account account, float amt) {
		super();
		this.operation = operation;
		this.account = account;
		this.amt = amt;
	}
	public void run() {
		if(operation==true)
			account.withdraw(amt);
		else
			account.deposit(amt);
	}
	
}
