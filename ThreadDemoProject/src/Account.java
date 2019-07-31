
public class Account {

	public float balance=0.0f;
	public Account(float balance) {
		this.balance=balance;
	}
	public synchronized void deposit(float depositAmount) {
		try {
			float curBalance;
			curBalance=balance;
			System.out.println("Read balance from"+Thread.currentThread()+
					" now adding"+depositAmount);
			Thread.currentThread().sleep(1000);
			curBalance=curBalance+depositAmount;
			Thread.currentThread().sleep(1000);
			balance=curBalance;
			System.out.println("Written balance as"+balance+" from"+Thread.currentThread());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public  synchronized void withdraw(float withdrawAmt) {
		try {
			float curBalance;
			Thread.currentThread().sleep(1000);
			curBalance=balance;
			System.out.println("Read balance as balance"+Thread.currentThread()+
					" now substracting"+withdrawAmt);
			Thread.currentThread().sleep(1000);
			curBalance=curBalance-withdrawAmt;
			Thread.currentThread().sleep(1000);
			balance=curBalance;
			System.out.println("Written balance as"+balance+" from"+Thread.currentThread());
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
