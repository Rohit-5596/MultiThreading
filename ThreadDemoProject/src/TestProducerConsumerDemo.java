
public class TestProducerConsumerDemo {

	public static void main(String[] args) {


		AccesserMutator am=new AccesserMutator();
		
		Producer producer=new Producer(am);
		Consumer consumer=new Consumer(am);
		
		Thread producerThread=new Thread(producer);
		Thread consumerThread=new Thread(consumer);
		
		 producerThread.start();
		 consumerThread.start();
		

	}

}
