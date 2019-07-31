
public class Consumer implements Runnable {

	AccesserMutator am;
	int limit;
	
	public Consumer(AccesserMutator am) {
		this.am=am;
			}
	@Override
	public void run() {
		
		int j=0;
		while(j<10) {
			try {
			Thread.sleep(1000);
			am.getData();
			j++;
		}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	}
}
