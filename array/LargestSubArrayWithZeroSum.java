package array;
//Problem Statement:Given an array of integers, find the length of the longest sub-array with a sum 
//that equals 0.
//Naive Approach: This involves the use of brute force where two nested loops are used. The outer 
//loop is used to fix the starting position of the sub-array, and the inner loop is used for the ending
//position of the sub-array and if the sum of elements is equal to zero, then increase the count.
public class LargestSubArrayWithZeroSum {
	public static int printMaxLength(int[] arr, int n) {
		int max_len = 0;
		for( int i = 0; i < n; i++) {
			int curr_sum = 0;
			for( int j = i; j < n; j++) {
				curr_sum = curr_sum +arr[j];
				if(curr_sum == 0)
					max_len = Math.max(max_len, j - i + 1);
			}
		}
		return max_len;
//		Time Complexity: O(n^2) due to the use of nested loops.
//		Space complexity: O(1) as no extra space is used.
	}

	public static void main(String[] args) {
		int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int n = arr.length;
        System.out.println("Length of the longest 0 sum "
                           + "subarray is " + printMaxLength(arr, n));

	}

}
