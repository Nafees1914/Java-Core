package Adapters;

import DynamicStackQueue.DynamicStack;

public class QUSDeqEff 
{
	DynamicStack ps = new DynamicStack();
	
	//O(n)
	public void enqueue(int item) throws Exception 
	{
		try 
		{
			DynamicStack hs = new DynamicStack();
			while(ps.size() != 0) 
			{
				hs.push(ps.pop());
			}
			ps.push(item);
			while(hs.size() != 0) 
			{
				ps.push(hs.pop());
			}
		}
		catch(Exception e) 
		{
			throw new Exception("Queue is Full");
		}
	}
	
	//O(1)
	public int dequeue() throws Exception 
	{
		try
		{
			return ps.pop();
		}
		catch(Exception e) 
		{
			throw new Exception("Queue is Empty");
		}
	}
	
	//O(1)
	public int getFront() throws Exception 
	{
		try
		{
			return ps.peek();
		}
		catch(Exception e) 
		{
			throw new Exception("Queue is Empty");
		}
	}
	
	//O(1)
		public int size() 
		{
			return ps.size();
		}
		
		//O(1)
		public boolean isEmpty() 
		{
			return ps.isEmpty();
		}
		
		//O(1)
		public boolean isFull() 
		{
			return ps.isFull();
		}
		
		//O(n)
		public void display() 
		{
			ps.display();
		}

}
