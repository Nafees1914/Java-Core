package HashMap;

import java.util.HashMap;

public class Intersection_Array {

	public static void main(String[] args) 
	{
		int[] one = {10,20,50,5,60,20,50,50,3,50,10};
		int[] two = {2,10,70,10,50,5,50,80,3,1,3};
		
		Intersection(one,two);
		

	}
	public static void Intersection(int[] one, int[] two) 
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		
		// 1. create a frequency map of array one
		for(int elem : one) 
		{
			int new_freq = map.getOrDefault(elem, 0) +1;
			map.put(elem, new_freq);
		}
		
		//2. Iterate array 2nd 
		for(int key : two) 
		{
			if(map.containsKey(key) && map.get(key) > 0) 
			{
				System.out.println(key);
				map.put(key,map.get(key)-1);
			}
		}
	}
}
