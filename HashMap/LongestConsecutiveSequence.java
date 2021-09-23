package HashMap;

import java.util.HashMap;

public class LongestConsecutiveSequence 
{

	public static void main(String[] args) 
	{
		int[] arr = {2,12,9,16,10,5,3,20,25,11,1,8,6};
		longestConsecutiveSequence(arr);
	}
	
	public static void longestConsecutiveSequence (int[] arr) 
	{
		// Make a map of integer element with proper true and false
		HashMap<Integer , Boolean> map = new HashMap<>();
		for(int key : arr) 
		{
			if(map.containsKey(key-1)) 
			{
				map.put(key,false);
			}
			else
			{
				map.put(key, true);
			}
			
			if(map.containsKey(key+1)) 
			{
				map.put(key+1, false);
			}
		}
		
		int max = 0;
		int startingPoint = 0;

		// loop on all keys
		for (int key : map.keySet()) {

			// filter out the keys which are starting point
			if (map.get(key)) {

				int count = 0;

				while (map.containsKey(key + count))
					count++;

				// System.out.println(key + " -> " + count);

				if (count > max) {
					max = count;
					startingPoint = key;
				}

			}

		}

		for (int i = 0; i < max; i++) {
			System.out.print(startingPoint + i + " ");
		}

	}

}
