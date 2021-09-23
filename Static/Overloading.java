package Static;

public class Overloading {

	public static void main(String[] args)
	{
		sum(2, 3);
		sum(2, 3, 5);
		sum(4.5, 8.9);
		
		// Variable length argument pass
		sum(7,8,9,10,11);
		
		// Variable length argument pass(array)
		int[] arr = {7,8,9,10,11};
		sum(arr);
	}
	
	public static void sum(int a, int b)
	{
		System.out.println("In 2 Args Sum");
		System.out.println(a + b);
	}
	
	public static void sum(int a, int b, int c)
	{
		System.out.println("In 3 Args Sum");
		System.out.println(a + b + c);
	}
	
	public static void sum(double a, double b)
	{
		System.out.println("In Double Sum");
		System.out.println(a + b);
	}
	
	public static void sum(int...a )
	{
		System.out.println("In variable args");
	}
}
