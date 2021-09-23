package DynamicStackQueue;

import Queue.Queue;

public class QueuesQs {

	public static void main(String[] args) throws Exception 
	{
		DynamicQueue q = new DynamicQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		System.out.println("Display Reverse");
		q.display();
		displayReverse(q ,0);
		q.display();
		
		System.out.println("Actual Reverse");
		q.display();
		actualReverse(q);
		q.display();
		
		

	}
	
	public static void displayReverse(DynamicQueue q, int count) throws Exception
	{
		
		if (count == q.size()) {
			return;
		}

		int temp = q.dequeue();
		q.enqueue(temp);

		displayReverse(q, count + 1);

		System.out.println(temp);
		
	}
	
	
	public static void actualReverse(DynamicQueue q) throws Exception 
	{
		
		if (q.isEmpty()) {
			return;
		}

		int temp = q.dequeue();

		actualReverse(q);

		q.enqueue(temp);
	}
	
//	public static void firstNegativeIntegerWindowK(int[] arr, int k) {
//
//		//error will come paste this into new file import util queue
//		
//		Queue<Integer> q = new LinkedList<>();
//
//		// prepare the first window
//		for (int i = 0; i <= k - 1; i++) {
//			if (arr[i] < 0)
//				q.add(i);
//		}
//
//		// 1st -ve integer for 1st window
//		if (q.isEmpty())
//			System.out.println("No 1st -ve");
//		else
//			System.out.println(arr[q.peek()]);
//
//		for (int i = k; i < arr.length; i++) {
//
//			// remove the elements which are out of present window
//			if (!q.isEmpty() && q.peek() == i - k)
//				q.remove();
//
//			// new value add
//			if (arr[i] < 0)
//				q.add(i);
//
//			// ans : 1st negative integer
//			if (q.isEmpty())
//				System.out.println("No 1st -ve");
//			else
//				System.out.println(arr[q.peek()]);
//
//		}
//
//	}
	
}
