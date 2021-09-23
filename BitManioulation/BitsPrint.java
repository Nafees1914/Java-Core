package BitManioulation;

public class BitsPrint {

	public static void main(String[] args) 
	{
		// Way 1
		int x = 100;
		
		while(x!=0)
		{
			int rem = x%2;
			System.out.println(rem);
			
			x = x/2;
		}

		System.out.println("----------");
		
		//Way 2
		int y = 100;
		
		while(y != 0)
		{
			int rem = y & 1;
			System.out.println(rem);
			
			y = y >> 1;
		}
	}

}
