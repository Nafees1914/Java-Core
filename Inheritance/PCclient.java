package Inheritance;

public class PCclient {

	public static void main(String[] args) {
	
	// Case 1
	parent obj1 = new parent();   
	System.out.println(obj1.d);   // 10
	System.out.println(obj1.d1);  // 100
	obj1.fun();
	obj1.fun1();
	
	System.out.println("-------------------");
	
	
	// Case 2
	parent obj2 = new child();
	System.out.println(obj2.d);  //10
	System.out.println(((child)obj2).d);  //20
	System.out.println(obj2.d1);  //100
	System.out.println(((child)obj2).d2); //200
	obj2.fun(); // C's fun
	((parent)obj2).fun(); // C's fun
	obj2.fun1();  // P's fun 1
	((child)obj2).fun2();  // C's fun 2
	
	System.out.println("-------------------");
	
	// Case 3  not allowed in any programming language
//	child obj3 = new parent();
	System.out.println("Case-3 is not valid");
	
	System.out.println("-------------------");
	
	
	// Case 4
	child obj4 = new child();
	System.out.println(obj4.d); // 20
	System.out.println(((parent)obj4).d); // 10
	System.out.println(obj4.d1); // 100
	System.out.println(obj4.d2); // 200
	obj4.fun(); // C's fun
	((parent)obj4).fun(); // C's fun
	obj4.fun1(); // P's fun 1
	obj4.fun2(); // C's fun 2
	
	}

}
