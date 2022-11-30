package StacksAndQueues;
//Problem Statement:Given an array, print the Next Greater Element (NGE) for every element. The Next 
//greater Element for an element x is the first greater element on the right side of x in the array.
//Elements for which no greater element exist, consider the next greater element as -1. 
public class NextGreater {
	//Apprach 1: Naive:
	public static void printGreater(int[] arr, int n) {
		int next, i, j;
		for(i = 0; i < n;i++) {
			next = -1;
			for(j = i+1; j < n; j++) {
				 if (arr[i] < arr[j]){
	                    next = arr[j];
	                    break;
	                }
	            }
	            System.out.println(arr[i]+" -- "+next);
			}
//		Time Complexity: O(N2) 
//		Auxiliary Space: O(1)
		}

	public static void main(String[] args) {
		 int arr[]= {11, 13, 21, 3};
	        int n = arr.length;
	        printGreater(arr, n);

	}

}
