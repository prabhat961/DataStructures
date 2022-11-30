package array;
//Problem Statement:Given an unsorted array of nonnegative integers, find a continuous subarray which
//adds to a given number. 
public class SubArraySum {
//Simple Approach: A simple solution is to consider all subarrays one by one and check the sum of 
//every subarray. Following program implements the simple solution. Run two loops: the outer loop
//picks a starting point I and the inner loop tries all subarrays starting from i.
public static int[] sumSubArray(int[] arr, int k) {
	int len = arr.length;
	int sum;
	for( int i = 0; i < len; i++) {
		sum = arr[i];
		for( int j = i + 1; j <= len; j++) {
			if(sum == k) {
				return new int[] {i, j-1};
			}
			if(sum > k)
				break;
			if( j < len)
				sum = sum + arr[j];
		}
	}
	return new int[] {-1};
	//Time Complexity: O(n*n)
	//Space Complexity: O(1)
}
//Efficient Approach: There is an idea if all the elements of the array are positive. If a subarray
//has sum greater than the given sum then there is no possibility that adding elements to the current 
//subarray the sum will be x (given sum). Idea is to use a similar approach to a sliding window. Start
//with an empty subarray, add elements to the subarray until the sum is less than x. If the sum is 
//greater than x, remove elements from the start of the current subarray.

public static int subArraySum(int arr[], int n, int sum){
    int curr_sum = arr[0], start = 0, i;

    // Pick a starting point
    for (i = 1; i <= n; i++) {
        // If curr_sum exceeds the sum,
        // then remove the starting elements
        while (curr_sum > sum && start < i - 1) {
            curr_sum = curr_sum - arr[start];
            start++;
        }

        // If curr_sum becomes equal to sum,
        // then return true
        if (curr_sum == sum) {
            int p = i - 1;
            System.out.println(
                "Sum found between indexes " + start
                + " and " + p);
            return 1;
        }
        // Add this element to curr_sum
        if (i < n)
            curr_sum = curr_sum + arr[i];
    }

    System.out.println("No subarray found");
    return 0;
//    Time Complexity : O(n). 
//    Only one traversal of the array is required. So the time complexity is O(n).
//    Space Complexity: O(1). 
//    As constant extra space is required.
}

		public static void main(String[] args) {
		int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        System.out.println(subArraySum(arr, n, sum));

	}

}
