package array;

import java.util.Arrays;

//Problem Statement:Given an array of DISTINCT elements, rearrange the elements of array in zig-zag 
//fashion in O(n) time. The converted array should be in form a < b > c < d > e < f.
//nput: arr[] = {4, 3, 7, 8, 6, 2, 1} 
//Output: arr[] = {3, 7, 4, 8, 2, 6, 1}
//A Simple Solution is to first sort the array. After sorting, exclude the first element, swap the 
//remaining elements in pairs. (i.e. keep arr[0] as it is, swap arr[1] and arr[2], swap arr[3] and 
//arr[4], and so on). 
//Time complexity: O(N log N) since we need to sort the array first.
//We can convert in O(n) time using an efficient approach. The idea is to use a modified one pass of
//bubble sort.
//Maintain a flag for representing which order(i.e. < or >) currently we need.
//If the current two elements are not in that order then swap those elements otherwise not.
public class ZigZagArray {
	
	static int[] arr = {4, 3, 7, 8, 6, 2, 1};
	
	public static void printZIgZag() {
		boolean flag = true;
		int temp;
		for( int i = 0; i <= arr.length - 2; i++) {
			if(flag) {
				if(arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			else {
				if(arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			flag = !flag;
		}
//		Time complexity: O(n) 
//		Auxiliary Space: O(1) 
	}

	public static void main(String[] args) {
		printZIgZag();
	        System.out.println(Arrays.toString(arr));

	}

}
