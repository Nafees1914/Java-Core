package GenericTreeDS;

import java.util.*;

public class GenericTree
{
	Scanner scn = new Scanner(System.in);
	
	private class Node
	{
		int data;
		ArrayList<Node> children = new ArrayList<>();
	
	}
	
	private Node root;
	
	public GenericTree() 
	{
		root = construct(null,-1);
	}
	
	private Node construct(Node parent, int ith) 
	{
		//prompt
		if(parent == null) 
		{
			System.out.println("Enter the data for root node ?");
		}
		else 
		{
			System.out.println("Enter the data for " + ith + " child of " + parent.data + "?");
		}
		
		
		//take input of data
		int item = scn.nextInt();
		
		// create a new node
		Node nn = new Node();
		
		//update the data
		nn.data = item;
		
		//prompt
		System.out.println("Enter the number of children for " + nn.data + "?");
		
		//take input for children (noc --> no. of children)
		int noc = scn.nextInt();
		for(int j = 0; j<noc; j++) 
		{
			Node child = construct(nn,j);
			nn.children.add(child);
		}
		
		return nn;
		
	}
	
	/*Making two display method using two different access modifier
	  --- make it work on abstract layer. ---> Abstraction
	*/
	public void display() 
	{
		System.out.println("--------------");
		display(root);
		System.out.println("--------------");
	}
	private void display(Node node) 
	{
		//self work
		String str = node.data + "->";
		for(Node child : node.children) 
		{
			str += child.data + " ";
		}
		str += ".";
		System.out.println(str);
		
		// smaller problem
		for(Node child : node.children) 
		{
			display(child);
		}
	}
	
	public int size() 
	{
		return size(root);
	}
	private int size(Node node) 
	{
		int ts = 0;  			//ts : total size
		for(Node child : node.children) 
		{
			int cs = size(child);	//cs - child size
			ts +=cs;
		}
		return ts+1;		
	}

}
