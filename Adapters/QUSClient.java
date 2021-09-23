package Adapters;

public class QUSClient {

	public static void main(String[] args) throws Exception 
	{
		// enqueue eff
		
//		QUSEnqEff queue = new QUSEnqEff();
		
		// dequeue eff 
		QUSDeqEff queue = new QUSDeqEff();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		queue.display();
		
		System.out.println(queue.dequeue());
		
		queue.display();

	}

}
