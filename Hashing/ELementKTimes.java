package Hashing;

import java.util.HashMap;

//Problem Statement:Given an array of n integers. The task is to find the first element that occurs k
//number of times. If no element occurs k times the print -1. The distribution of integer elements
//could be in any range.
//Simple Approach: By using two loops, count the number of times a number appears in the array.
//Time complexity: O(n2).

//Efficient Approach: Use unordered_map for hashing as range is not known. Steps:  
//Traverse the array elements from left to right.
//While traversing increment their count in the hash table.
//Again traverse the array from left to right and check which element has a count equal to k. Print that element and stop.
//If no element has a count equal to k, print -1.
//Time Complexity: O(n)


public class ELementKTimes {
	public static int firstkElement( int[] arr, int n, int k) {
		HashMap<Integer, Integer>count = new HashMap<>();
		for ( int i = 0; i < n; i++) {
			int a = 0;
            if(count.get(arr[i])!=null){
                a = count.get(arr[i]);
            }
            count.put(arr[i], a+1);
	}
		for( int i = 0; i < n; i++) {
			if(count.get(arr[i])==k) {
				return arr[i];
			}
		}
		return -1;
}

	public static void main(String[] args) {
		int[] arr = {1, 7, 4, 3, 4, 8, 7};
        int n = arr.length;
        int k = 2;
        System.out.println(firstkElement(arr, n, k));


	}

}
