
public class Producer implements Runnable {

	AccesserMutator am;
	
	public Producer(AccesserMutator am) {
		this.am=am;
	}
	@Override
	public void run() {
		
		int j=0;
		while(j<10) {
			try {
			Thread.sleep(1000);
			am.setData(j);
			j++;
		}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	}
	}

