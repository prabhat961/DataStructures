package array;
//Problem Statement:The simple idea of Kadane’s algorithm is to look for all positive contiguous segments
//of the array (max_ending_here is used for this). And keep track of maximum sum contiguous segment
//among all positive segments (max_so_far is used for this). Each time we get a positive-sum compare 
//it with max_so_far and update max_so_far if it is greater than max_so_far 

public class KadensAlgorithm {
	public static int maxSubArraySum(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int maxEnding = 0;
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			maxEnding = maxEnding + arr[i];
			if(maxSum < maxEnding)
				maxSum = maxEnding;
			if(maxEnding < 0)
				maxEnding = 0;
		}
		return maxSum;
	}
	

	public static void main(String[] args) {
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(a));

	}

}
