package BitManioulation;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int mul = 1;
		
		int sum = 0;
		
		while(n!=0) 
		{
			int rem = n % 10;
			
			n = n/10;
			
			int temp = rem * mul;
			
			sum = sum + temp;
			
			mul = mul*2;
		}
		
		System.out.println(sum);

	}

}
