package BitManioulation;

public class MagicNo {

	public static void main(String[] args) 
	{
		int n = 8;

		int mult = 1; // 5 power 0
		int ans = 0;

		while (n != 0) {
			int lastBit = (n & 1) ; 
			if (lastBit == 1)
				ans += mult;
			
			// update multiplier to make its contribution
			mult = mult * 5;
			
			//to discard the last bit 
			n = n >> 1;

		}

		System.out.println(ans);


	}

}
