package Hashing;

import java.util.*;

//Problem Statement: Given an array of size n and an integer k, return the count of distinct numbers
//in all windows of size k. 
//Naive Approach: The naive solution is to traverse the given array considering every window in it and keeping a count on the distinct elements of the window. 

//Algorithm: 
//For every index i from 0 to len_array(n) – k, i.e n – k, traverse the array from i to i + k. 
//This is the window, Traverse the window, from i to that index and check if the element is present
//or not.If the element is not present in the prefix of the array, i.e no duplicate element is present
//from i to index-1, then increase the count.Print the count
//Time complexity: O(nk2). 
public class CountDistinctInK {
	//Efficient Approach:
	
	public static void countDistinct(int[] arr, int k) {
		Map<Integer, Integer>map = new HashMap<>();
		for ( int i = 0; i < k; i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		System.out.println(map.size());
		for( int i = k; i < arr.length; i++) {
			if (map.get(arr[i - k]) == 1) {
				map.remove(arr[i - k]);
				}
			 else // reduce count of the removed element
	                map.put(arr[i - k],  map.get(arr[i - k]) - 1); 
			 map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			  
	            // Print count of current window
	            System.out.println(map.size());
		}
//		Time complexity O(n). A single traversal of the array is required.
//		Space Complexity O(n). Since the hashmap requires linear space.
	}
	
	public static void main(String[] args) {
		 int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
	        int k = 4;
	        countDistinct(arr, k);
	}

}
