package array;
//Problem Statement: Given two arrays of integers, find a pair of values (one value from each array) 
//that you can swap to give the two arrays the same sum.
public class PairSwap {
//Method 1 (Naive Implementation): 
//Iterate through the arrays and check all pairs of values. Compare new sums or look for a pair with 
//that difference. 
	
	public static int getSrum(int[] arr, int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	public static void getVaue(int[] A, int[] B, int m, int n) {
		int sum1 = getSrum(A,n);
		int sum2 = getSrum(B,m);
		int newsum1, newsum2, val1 = 0, val2 = 0;
		for( int i = 0; i < n; i++) {
			for( int j = 0; j < m; j++) {
				newsum1 = sum1 - A[i] + B[j];
				newsum2 = sum2 - B[j] +A[i];
				 if (newsum1 == newsum2){
	                    val1 = A[i];
	                    val2 = B[j];
	                }
			}
		}
		System.out.println(val1+" "+val2);
		//Time Complexity :- O(n*m)
	}
	
	
		 
	public static void main(String[] args) {
		int A[] = { 4, 1, 2, 1, 1, 2 };
        int n = A.length;
        int B[] = { 3, 6, 3, 3 };
        int m = B.length;
  
        // Call to function
        getVaue(A, B, m, n);

	}

}
