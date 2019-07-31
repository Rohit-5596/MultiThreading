
public class TestBankOperationDemo {

	
	public static void main(String args[]) {
		try {
			final boolean withdraw=true,deposit=false;
			Account account1=new Account(10000.0f);
			
			AccountUser user1=new AccountUser(withdraw,account1,3000.0f);
			AccountUser user2=new AccountUser(deposit,account1,2000.0f);
			
			user1.start();
			user2.start();
			
			user1.join();
			user2.join();
			
			System.out.println("Final Account Balance is....."+account1.balance);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
