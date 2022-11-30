package Hashing;
//Problem Statement:Given two arrays X[] and Y[] of positive integers, find a number of pairs such that
//x^y > y^x where x is an element from X[] and y is an element from Y[].


public class findPairs {
	//Method 1: Basic Approach:
		public static long searchPairs(long[] arr1, long[] arr2, int m, int n) {
			long ans = 0;
			for ( int i = 0; i < m; i++)
				for( int j = 0; j < n;j++)
					if(Math.pow(arr1[i],arr2[j]) > Math.pow(arr1[j], arr2[i]))
						ans++;
			return ans;
		}
		//Time Complexity: O(M*N) where M and N are sizes of given arrays
		 public static void main(String args[]){
		    {
		        long X[] = { 2, 1, 6 };
		        long Y[] = { 1, 5 };
		 
		        System.out.println(
		            "Total pairs = "
		            + searchPairs(X, Y, X.length, Y.length));
		    }
		 }
}
