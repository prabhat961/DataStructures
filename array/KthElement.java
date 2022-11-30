package array;
//Problem Statement: Given two sorted arrays of size m and n respectively, you are tasked with finding
//the element that would be at the k’th position of the final sorted array.
//Basic Approach 
//Since we are given two sorted arrays, we can use the merging technique to get the final merged array.
//From this, we simply go to the k’th index.
public class KthElement {
	
	public static int kthElement(int[] arr1, int[] arr2, int m, int n, int k) {
		int[] sorted = new int[m + n];
		int i = 0, j = 0, d = 0;
		while(i < m && j < n) {
			if(arr1[i] < arr2[j]) 
				sorted[d++] = arr1[i++];
            else
                sorted[d++] = arr2[j++];
			}
		while (i < m)
            sorted[d++] = arr1[i++];
        while (j < n)
            sorted[d++] = arr2[j++];
        return sorted[k - 1];
	}
//	Time Complexity: O(n) 
//	Auxiliary Space : O(m + n) 

	public static void main(String[] args) {
		int arr1[] = {2, 3, 6, 7, 9};
        int arr2[] = {1, 4, 8, 10};
        int k = 5;
        System.out.print(kthElement(arr1, arr2, 5, 4, k));
		
	}

}
