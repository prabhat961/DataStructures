package array;

import java.util.Arrays;

//Problem Statement: Given an array, reverse every sub-array formed by consecutive k elements.
//Approach: Consider every sub-array of size k starting from the beginning of the array and reverse it.
//We need to handle some special cases. If k is not multiple of n where n is the size of the array,
//for the last group we will have less than k elements left, we need to reverse all remaining elements.
//If k = 1, the array should remain unchanged. If k >= n, we reverse all elements present in the array.

public class ArrayGroupReversal {
	
	public static void groupReversal(int[] arr, int k, int len) {
		len = arr.length;
		for( int i = 0; i < len; i = i + k) {
			int start = i;
			int end = Math.min(i + k - 1, len - 1);
			while(start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
//		Time complexity of above solution is O(n). 
//		Auxiliary space used by the program is O(1).
	}

	public static void main(String[] args) {
		  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
	        int k = 3;
	     
	        int n = arr.length;
	     
	        groupReversal(arr, n, k);
	        System.out.println(Arrays.toString(arr));

	}

}
