package LinkedList;

public class LLClient {

	public static void main(String[] args) throws Exception
	{
		
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addLast(30);
		ll.display();

		ll.addLast(40);
		ll.display();
		ll.addLast(50);
		ll.display();
		
		ll.addAt(2, 60);
		ll.display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.getAt(3));
		
		System.out.println(ll.removeFirst());
		ll.display();
		ll.addLast(70);
		ll.display();
		System.out.println(ll.removeLast()); 
		ll.addFirst(80);
		ll.display();
		System.out.println(ll.removeAt(2));
		ll.display();
		
		ll.reverseI();
		ll.display();
		
		ll.reverseR() ;
		ll.display();
		
		ll.reverseR2() ;
		ll.display();
		
		System.out.println(ll.mid());
		System.out.println(ll.kthFromLast(4));
		
		ll.createDummyList();
		
//		ll.addLast(65);
//		ll.addLast(75);
//		ll.addLast(85);
//		ll.addLast(95);
//		ll.display();
//		
//		ll.kReverse(3);
//		ll.display();
		
		ll.createDummyListLoop();
		
	}  

}
