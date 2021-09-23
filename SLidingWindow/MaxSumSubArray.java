package SLidingWindow;
import java.util.*;


// Maximum sum SubArray of size K

public class MaxSumSubArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		//Method : 1 
		int maxSum = maxSumSubArray(arr,N,k);
		System.out.println(maxSum);
		
		//Method : 2
		
		int max_Sum = MaxSum(arr,N,k);
		System.out.println(maxSum);
		
	}
	
	public static int maxSumSubArray(int[] arr, int N, int k) 
	{
		int start = 0;
		int end = 0;
		int sum = 0;
		int maxSum = 0;
		
		while(end < k && end < N) 
		{
			sum += arr[end];
			end++;
		}
		
		while(end < N) 
		{
			if(sum>maxSum) 
			{
				maxSum = sum;
			}
			sum += arr[end];
			sum -= arr[start];
			start++;
			end++;
			
		}
		if(sum>maxSum) 
		{
			maxSum = sum;
		}
		
		return maxSum;
	}
	
	public static int MaxSum(int[] arr, int N, int k) 
	{
		int sum = 0;
		int max_sum = 0;
		for(int i =0; i < k; i++) 
		{
			sum += arr[i];
		}
		
		for(int i = k; i<N; i++ ) 
		{
			sum += arr[i] - arr[i-k];
			
			max_sum = Math.max(max_sum, sum);
		}
		return max_sum;
	}

}

/*

7
2 5 1 8 2 9 10
3


9
1 4 2 10 23 3 1 0 20
4


*/

