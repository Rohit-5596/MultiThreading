
public class TestThreadDemo implements Runnable  {

	static Thread t1=null,t2=null;
public static void main(String args[]) {
	
	String mainThreadName=Thread.currentThread().getName();
	System.out.println(mainThreadName+ "Thread Starts here");
	//Thread t1=new GreetThread("Welcome");//born state
	//Thread t2=new GreetThread("Capgemini");
	GreetThread obj1=new GreetThread("Welcome");
	GreetThread obj2=new GreetThread("Capgemini");
	
	 t1=new Thread(obj1);
	 t2=new Thread(obj2);
	t1.start();//makes thread go in a runnable state
	t2.start();
	try {
	t1.join();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	try {
		t2.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
for(int i=1;i<=5;i++)
{
	System.out.println("Hello All");
	try {
		Thread.sleep(3000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	
}
System.out.println("Main thread ends here");
}

@Override
public void run() {
	
	
}
}