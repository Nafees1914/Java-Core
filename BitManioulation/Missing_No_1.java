package BitManioulation;

public class Missing_No_1 {

	public static void main(String[] args)
	{
		int n = 7;
		int[] arr = {1,2,3,6,7,5};
		
		int xor = 0;
		
		for(int val : arr) 
		{
			xor ^= val;
		}
		
		for(int i =1; i<=n ; i++)
			xor ^= i;
		
		System.out.println(xor);
	}

}
