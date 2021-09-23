package Adapters;

import DynamicStackQueue.DynamicStack;

public class QUSEnqEff 
{
	DynamicStack ps = new DynamicStack();
	
	
	// O(1)
	public void enqueue(int item) throws Exception 
	{
		try
		{			
			ps.push(item);
		}
		catch(Exception e) 
		{
			throw new Exception("Queue is Full");
		}
	}
	
	
	//O(n)
	public int dequeue() throws Exception 
	{
		try{
			DynamicStack hs = new DynamicStack();
		
		
		while(ps.size() != 1) 
		{
			hs.push(ps.pop());
		}
		
		int temp = ps.pop();
		
		while(hs.size() != 0) 
		{
			ps.push(hs.pop());
		}
		
		return temp;
		
		}
		catch(Exception e) 
		{
			throw new Exception("Queue is Empty");
		}
	}
	
	//o(n)
	public int getFront() throws Exception 
	{
		try{
			DynamicStack hs = new DynamicStack();
		
		
		while(ps.size() != 1) 
		{
			hs.push(ps.pop());
		}
		
		int temp = ps.pop();
		
		hs.push(temp);
		
		while(hs.size() != 0) 
		{
			ps.push(hs.pop());
		}
		
		return temp;
		
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
	public void display() throws Exception 
	{
		System.out.println("-------------");
		displayH();
		System.out.println("-------------");
	}
	private void displayH() throws Exception 
	{
		try
		{
			if(ps.isEmpty()) 
		
		{
			return;
		}
		int temp = ps.pop();
		displayH();
		System.out.println(temp);
		ps.push(temp);
		}
		catch(Exception e)
		{
			throw new Exception("Error in Dispaly");
		}
	}
}
