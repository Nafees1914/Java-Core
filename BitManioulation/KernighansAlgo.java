package BitManioulation;

public class KernighansAlgo {

	public static void main(String[] args) 
	{
		int x = 120;
		int count = 0;
		
		System.out.println(Integer.toBinaryString(x));
		
		while(x!=0) 
		{
			int rmsbmask = (x & (-x));
			x = x - rmsbmask;
			count++;
		}
		System.out.println(count);
	}

}
