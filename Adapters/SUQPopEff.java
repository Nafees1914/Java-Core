package Adapters;

import DynamicStackQueue.DynamicQueue;

public class SUQPopEff 
{
	
	DynamicQueue pq = new DynamicQueue();
	
	// O(n)
	public void push(int item) throws Exception {

		try {
			DynamicQueue hq = new DynamicQueue();

			hq.enqueue(item);
			while (pq.size() != 0) {
				hq.enqueue(pq.dequeue());
			}

			pq = hq;
		} catch (Exception e) {
			throw new Exception("Stack is Full");
		}
	}
	
	// O(1)
	public int pop() throws Exception {
		try {
			return pq.dequeue();
		} catch (Exception e) {
			throw new Exception("Stack is Empty");
		}
	}
	
	// O(1)
	public int peek() throws Exception {
		try {
			return pq.getFront();
		} catch (Exception e) {
			throw new Exception("Stack is Empty");
		}
	}

	// O(1)
	public int size() {
		return pq.size();
	}

	// O(1)
	public boolean isEmpty() {
		return pq.isEmpty();
	}

	// O(1)
	public boolean isFull() {
		return pq.isFull();
	}
	
	// O(n)
	public void display() 
	{
		pq.display();
	}

}
