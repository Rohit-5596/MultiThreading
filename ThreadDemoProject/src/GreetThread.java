
public class GreetThread extends Thread {

	String msg;
	public GreetThread(String msg)
	{
		this.msg=msg;
	}
	public void run()
	{
		Thread curTObj=Thread.currentThread();
		if(curTObj==TestThreadDemo.t1)
		{
			try {
			TestThreadDemo.t2.join();
		}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int j=1;j<=3;j++)
		{
			System.out.println(msg);
			try {
			Thread.sleep(5000);
		}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
