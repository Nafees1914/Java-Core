package BitManioulation;

public class Count_set_bits {

	public static void main(String[] args) 
	{
		int x = 100;
		int count =0;
		
		System.out.println(Integer.toBinaryString(x));
		while(x!=0) 
		{
			if((x & 1) == 1) 
			{
				count++;
			}
			x = x>>1;
		}
		
		System.out.println(count);

	}

}
