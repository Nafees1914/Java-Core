package LinkedList;

public class LinkedList 
{
	private class Node
	{
		int data;
		Node next;
		
		// Constructor for Dummy Linked list
		Node(int data)
		{
			this.data = data;
		}
		
		Node()
		{
			
		}
		
	}
	
	private Node head;
	
	// Display the elements of linked list
	public void display() 
	{
		System.out.println("-------------------------");
		
		Node temp = head;
		
		while(temp!=null) 
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
	}
	
	public int size() 
	{
		int count = 0;
		Node temp = head;
		while(temp!=null) 
		{
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	
	public boolean isEmpty() 
	{
		//return size() == 0; // leads to increase complexity
		
		return head == null; 
	}
	
	
	public int getFirst() throws Exception 
	{

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		return head.data;

	}
	
	public int getLast() throws Exception 
	{

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		return temp.data;

	}
	
	public int getAt(int idx) throws Exception 
	{

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		if (idx < 0 || idx >= size()) {
			throw new Exception("Invalid Index.");
		}

		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp.data;

	}
	
	private Node getNodeAt(int idx) throws Exception 
	{

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		if (idx < 0 || idx >= size()) {
			throw new Exception("Invalid Index.");
		}

		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp;

	}
	
	public void addLast(int item) throws Exception 
	{

		// created a new node with data as item
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (isEmpty()) {

			// your ll was already empty and now you are adding an element for the 1st time
			// : special case
			head = nn;

		} else {

			// linking
			Node last = getNodeAt(size() - 1);
			last.next = nn;

		}
	}

	public void addFirst(int item) 
	{

		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// linking
		nn.next = head;
		head = nn;

	}
	
	public void addAt(int idx, int item) throws Exception 
	{

		if (idx < 0 || idx > size()) 
		{
			throw new Exception("Invalid Index.");
		}

		if (idx == 0)
			addFirst(item);

		else if (idx == size())
			addLast(item);

		else 
		{

			// create a new node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// linking
			Node n1 = getNodeAt(idx - 1);
			Node n2 = getNodeAt(idx);

			n1.next = nn;
			nn.next = n2;

		}
		
	}
	
	public int removeLast() throws Exception 
	{

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		int rv = getLast();

		if (size() == 1) {
			head = null;
		} else {
			Node sm2 = getNodeAt(size() - 2);
			sm2.next = null;
		}

		return rv;
	}
	
	public int removeFirst() throws Exception 
	{

		if(isEmpty()) 
		{
			throw new Exception("LL is Empty.");
		}

		int rv = getFirst();

		if (size() == 1) {
			head = null;
		} else {
			head = head.next;
		}

		return rv;
		
	}
	
	public int removeAt(int idx) throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		if (idx < 0 || idx >= size()) {
			throw new Exception("Invalid Index.");
		}

		if (idx == 0)
			return removeFirst();

		else if (idx == size() - 1)
			return removeLast();

		else {

			Node im1 = getNodeAt(idx - 1);
			Node i = im1.next;
			Node ip1 = i.next;

			im1.next = ip1;

			return i.data;

		}

	}
	
	// Iterative method to reverse a linked list
	
//	public void reverseI()     // Way --  1
//	{
//
//		Node prev = head;
//		Node curr = prev.next;
//
//		while (curr != null) {
//
//			Node ahead = curr.next;
//			curr.next = prev;
//
//			prev = curr;
//			curr = ahead;
//
//		}
//		
//		head.next = null;
//
//		head = prev;
//
//	}
	
	public void reverseI()    //way --- 2
	{

		Node prev = null;
		Node curr = head;

		while (curr != null) {

			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;

		}

		head = prev;

	}
	
	// Recursive method to reverse a linked list - with two argument
	// Abstraction // linked head can't be accessible hence we use abstraction
	
	
	public void reverseR() 
	{
		reverseR(null, head);
	}

	private void reverseR(Node prev, Node curr) 
	{

		if (curr == null) {
			head = prev;
			return;
		}

		reverseR(curr, curr.next);
		curr.next = prev;
	}
	
	
	// Recursive method to reverse a linked list - with one argument
	// Abstraction // linked head can't be accessible hence we use abstraction
	public void reverseR2() 
	{

		Node temp = head;

		reverseR2(head);

		temp.next = null;
	}

	private void reverseR2(Node curr) 
	{

		// last node
		if (curr.next == null) {
			head = curr;
			return;
		}

		reverseR2(curr.next);

		curr.next.next = curr;
	}
	
	
	// find the content at mid node of odd/even linked list
	
	public int mid() {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

		}

		return slow.data;

	}
	
	// find the content of K-th node from last
	public int kthFromLast(int k) 
	{
		Node slow = head;
		Node fast = head;
		
		for(int i =1; i<=k;i++) 
		{
			fast = fast.next;	
		}
		while(fast!=null) 
		{
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow.data;
	}
	
	public void createDummyList() {

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		Node n9 = new Node(9);
		Node n10 = new Node(10);
		Node n11 = new Node(11);
		Node n12 = new Node(12);
		Node n13 = new Node(13);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n10.next = null;

		n13.next = n12;
		n12.next = n11;
		n11.next = n4;

		System.out.println(intersection(n1, n13));

	}

	public int intersection(Node h1, Node h2) {

		Node fp = h1;
		Node sp = h2;

		while (fp != sp) {

			if (fp == null)
				fp = h2;
			else
				fp = fp.next;

			if (sp == null)
				sp = h1;
			else
				sp = sp.next;

		}

		return fp.data ;

	}
	
	public void kReverse(int k)
	{
		 head = kReverse(head , k);
	}
	
	private Node kReverse(Node node, int k) 
	{
		// to identify the argument of smaller problem
		// i<=k --> for k-multiple  
		// temp != null --> for non k-multiple
		
		Node temp = node;
		for(int i =1; i<=k && temp != null; i++) 
		{
			temp = temp.next;
		}
		
		// Smaller problem : s2 and s3 reverse
		Node prev = kReverse(temp, k);
		
		//self work : reverse s1
		Node curr = node;
		while(curr != temp) 
		{
			 Node ahead = curr.next;
			 curr.next = prev;
			 
			 prev = curr;
			 curr = ahead;
		}
		return prev;
		
	}
	
	// detect and remove cycle from loop
	public void createDummyListLoop() 
	{

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n3;
		
		//logic
		System.out.println(detectLoop(n1)); 

	}
	
	// Floyd cycle detect loop 
	public boolean detectLoop(Node h1) 
	{
		Node slow = h1;
		Node fast = h1;
		
		while(fast !=null && fast.next !=null) 
		{
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) 
			{
//				removeLoop(slow,h1);
				removeLoop2(slow,h1);
				return true;
			}
		}
		return false;
	}
	
//	public void removeLoop(Node meet, Node h) 
//	{
//		//Numbers of node in loop
//		Node temp = meet;
//		int count =1;
//		while(temp.next!=meet) 
//		{
//			count++;
//			temp = temp.next;
//		}
//		
//		//move a pointer count no. of steps ahead
//		Node fast = h;
//		for(int i=1; i<=count; i++) 
//		{
//			fast = fast.next;
//		}
//		
//		//make slow and fast move at same speed
//		Node slow =h;
//		while(slow.next != fast.next) 
//		{
//			fast = fast.next;
//			slow = slow.next;
//		}
//		
//		fast.next = null;
//		
//		//print linked list
//		Node t = h;
//		while(t!=null) 
//		{
//			System.out.print(t.data + " ");
//			t = t.next;
//		}
//		System.out.println();
//	}
	
	//Method  Floyd cycle removal algo
	public void removeLoop2(Node meet, Node h) 
	{
		Node start = h;
		Node loop = meet;
		while(start.next != loop.next) 
		{
			start = start.next;
			loop = loop.next;
		}
		loop.next = null;
		
//		print linked list
		Node t = h;
		while(t!=null) 
		{
			System.out.print(t.data + " ");
			t = t.next;
		}
		System.out.println();
	}
}
