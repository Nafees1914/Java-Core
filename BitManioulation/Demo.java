package BitManioulation;


public class Demo {

	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(95));
		byte by = (byte)560;
		System.out.println(by);
		
		// Bitwise OR(|)
		System.out.println(20|40);
		
		// Bitwise AND(&)
		System.out.println(36|40);
		
		// Bitwise XOR(|)
		System.out.println(36^40);
		System.out.println(5^7^6^5^7);
		
		//example for left shift out of range(use type cast so no. will be in range)
		
		byte be = 77;
		be = (byte)(be<<1);
		System.out.println(be);
		
		
	}

}
