package SearchingAndSorting;

import java.util.Arrays;

public class KthSmallest {
	
	public static int findKthElement(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k -1];
	}
	//Time Complexity of this solution is O(N Log N) 

	public static void main(String[] args) {
		int[] arr = { 12, 3, 5, 7, 19 };
        int k = 2;
        System.out.print("K'th smallest element is " + findKthElement(arr, k));
	}

}
