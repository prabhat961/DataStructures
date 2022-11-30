package array;
//Problem Statement:Given n non-negative integers representing an elevation map where the width of each
//bar is 1, compute how much water it is able to trap after raining.
//Basic Insight: 
//An element of the array can store water if there are higher bars on the left and right. The amount of
//water to be stored in every element can be found out by finding the heights of bars on the left and 
//right sides. The idea is to compute the amount of water that can be stored in every element of the 
//array. 

public class TrappingRainWater {
	
	public static int rainWaterTrapping(int[] arr, int n) {
			    // that can be stored
	    int res = 0;
	 
	    // For every element of the array
	    // except first and last element
	    for(int i = 1; i < n - 1; i++)
	    {
	         
	        // Find maximum element on its left
	        int left = arr[i];
	        for(int j = 0; j < i; j++)
	        {
	            left = Math.max(left, arr[j]);
	        }
	 
	        // Find maximum element on its right
	        int right = arr[i];
	        for(int j = i + 1; j < n; j++)
	        {
	            right = Math.max(right, arr[j]);
	        }
	 
	        // Update maximum water value
	        res += Math.min(left, right) - arr[i];
	    }
	    return res;
//	    Time Complexity: O(n2). 
//	    There are two nested loops traversing the array, So time Complexity is O(n2).
//	    Space Complexity: O(1). 
//	    No extra space is required.
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 1, 0,
                1, 3, 2, 1, 2, 1 };
  int n = arr.length;

  System.out.print(rainWaterTrapping(arr,n));

	}

}
