
public class AccesserMutator {

	int data;
	boolean flag=false;

	public synchronized int getData() {
		if(!flag)
		{
			try {
				wait();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Got: "+data);
		flag=false;
		notify();
		return data;
	}

	public synchronized void setData(int data) {
		this.data = data;
		if(flag)
		{
			try {
				wait();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Set: "+data);
		flag=true;
		notify();
	}
	
	
	
	
}
