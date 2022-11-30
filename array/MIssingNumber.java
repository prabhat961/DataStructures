package array;
//Problem Statement:You are given a list of n-1 integers and these integers are in the range of 1 to n.
//There are no duplicates in the list. One of the integers is missing in the list. Write an efficient
//code to find the missing integer.
public class MIssingNumber {
	
	public static int printMissingNumber(int[] arr) {
		int n = arr.length;
		int sum = ((n + 1) * (n + 2))/2;
		for(int i = 0; i < n; i++)
			sum = sum - arr[i];
		return sum;
	}
//	Time Complexity: O(n). 
//	Only one traversal of the array is needed.
//	Space Complexity: O(1). 
//	No extra space is needed
	

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 6 };
        System.out.println(printMissingNumber(a));

	}

}
