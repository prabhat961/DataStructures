package SearchingAndSorting;
//Problem Statement:nversion Count for an array indicates – how far (or close) the array is from being
//sorted. If the array is already sorted, then the inversion count is 0, but if the array is sorted in
//the reverse order, the inversion count is the maximum.
//approach:Traverse through the array, and for every index, find the number of smaller elements on its
//right side of the array. This can be done using a nested loop. Sum up the counts for all index in the
//array and print the sum.
public class Inversion {
	
	public static int countInverse(int[] arr, int n) {
			int inversecount = 0;
			for( int i = 0; i < n - 1; i++)
				for( int j = i + 1; j < n; j++)
					if( arr[i] > arr[j])
							inversecount++;
		return inversecount;
//		Time Complexity: O(n^2),
//		Space Complexity:O(1)
	}

	public static void main(String[] args) {
		int[] arr = { 1, 20, 6, 4, 5 };
		int n = arr.length;
		System.out.println("No of inverse present in the array:"+countInverse(arr, n));

	}

}
