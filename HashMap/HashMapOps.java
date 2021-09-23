package HashMap;

import java.util.HashMap;

public class HashMapOps {

	public static void main(String[] args) 
	{
		String str = "abcaabcccdeac";
		System.out.println(maxFreqChar(str));
		
	}
	
	public static char maxFreqChar(String str) 
	{
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i =0; i<str.length(); i++) 
		{
			if(map.containsKey(str.charAt(i))) 
			{
				int old_freq = map.get(str.charAt(i));
				int new_freq = old_freq +1;
				map.put(str.charAt(i), new_freq);
			}
			else 
			{
				map.put(str.charAt(i), 1);
			}
			
//			// another method write above  if_else condition
//			int new_freq = map.getOrDefault(str.charAt(i), 0) +1;
//			map.put(str.charAt(i), new_freq);
			
		}
		
		int max = 0;
		char ch = ' ';
		for(char key : map.keySet()) 
		{
			int freq = map.get(key);
			if(freq > max) 
			{
				max=freq;
				ch = key;
			}	
		}
		
		return ch;
	}

}
