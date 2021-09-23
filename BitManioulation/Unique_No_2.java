package BitManioulation;

public class Unique_No_2 {

	public static void main(String[] args) 
	{
		int[] arr = {36,50,24,56,36,24,42,50};
		
		int xor = 0;
		for(int val : arr) 
		{
			xor ^= val;			// at last we get 18
		}
		
		int rmsbMask = xor & (-xor);
		
		int n1 = 0;
		int n2 = 0;
		
		for(int val : arr)
		{
			//unset
			if((val & rmsbMask) == 0)
			{
				n1 ^= val;
			}
			//set
			else 
			{
				n2 ^= val;
			}
		}
		
		System.out.println(n1 +" " + n2);
	}

}
