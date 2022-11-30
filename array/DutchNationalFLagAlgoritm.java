package array;

import java.util.Arrays;

// Description: Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts
//the given array. The functions should put all 0s first, then all 1s and all 2s in last.

public class DutchNationalFLagAlgoritm {
	// Method 1: Naive Approach:The problem is similar to our old post Segregate 0s and 1s in an array, 
	//and both of these problems are variation of famous Dutch national flag problem.
	public static void swap012(int[] arr) {
		int lo =0;
		int mid = 0;
		int hi = arr.length -1;
		while( mid <= hi) {
			int temp;
			switch(arr[mid]) {
			case 0:
				temp = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = temp;
				++lo;
				++mid;
				break;
			case 1:
				++mid;
				break;
			case 2:
				temp = arr[hi];
				arr[hi] = arr[mid];
				arr[mid] = temp;
				--hi;
			}
		}
//		Time Complexity: O(n). 
//		Only one traversal of the array is needed.
//		Space Complexity: O(1). 
//		No extra space is required.
	}
	
//Method 2: Count the number of 0s, 1s and 2s in the given array. Then store all the 0s in the
//beginning followed by all the 1s then all the 2s.
	
	public static void printSwap012(int[] arr, int  n) {
		int i,ct0 = 0,ct1 = 0, ct2 = 0;
		for( int j =0; j < n; j++) {
			switch(arr[j]) {
			case 0:
				ct0++;
				break;
			case 1:
				ct1++;
				break;
			case 2:
				ct2++;
				break;
			}
		}
		i = 0;
		while(ct0 > 0) {
			arr[i++] = 0;
			ct0--;
		}
		while(ct1 > 0) {
			arr[i++] = 1;
			ct1--;
		}
		while(ct2 > 0) {
			arr[i++] = 2;
			ct2--;
		}
//		Time Complexity: O(n). 
//		Only two traversals of the array is needed.
//		Space Complexity: O(1). 
//		As no extra space is required.
	}
	

	public static void main(String[] args) {
		 int[] arr = new int[]{0, 2, 0, 1, 1, 2, 2, 0, 0, 0, 1, 0, 1};
	        System.out.println("Sorted array without any algorithm is:");
	        int n = arr.length;
	        printSwap012(arr, n);
	        System.out.println(Arrays.toString(arr));

	}

}
