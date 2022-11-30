package SearchingAndSorting;

import java.util.*;

//Problem Statement: Given two sorted arrays, the task is to merge them in a sorted manner.
//Method 1 (O(n1 * n2) Time and O(n1+n2) Extra Space) 

//Create an array arr3[] of size n1 + n2.
//Copy all n1 elements of arr1[] to arr3[]
//Traverse arr2[] and one by one insert elements (like insertion sort) of arr3[] to arr1[]. 
//This step take O(n1 * n2) time.
public class MargeTwoSorted {
	 public static void mergeArrays(int[] arr1, int[] arr2, int n1,
             int n2, int[] arr3){
		 int i = 0, j = 0, k = 0;

		 // Traverse both array
		 while (i<n1 && j <n2)
		 {
			 // Check if current element of first
			 // array is smaller than current element
			 // of second array. If yes, store first
			 // array element and increment first array
			 // index. Otherwise do same with second array
			 if (arr1[i] < arr2[j])
				 arr3[k++] = arr1[i++];
			 else
				 arr3[k++] = arr2[j++];
		 }

		 // Store remaining elements of first array
		 while (i < n1)
			 arr3[k++] = arr1[i++];

		 // Store remaining elements of second array
		 while (j < n2)
			 arr3[k++] = arr2[j++];
//		 Time Complexity : O(n1 + n2) 
//		 Auxiliary Space : O(n1 + n2)
}
//	Method 2: Using Maps (O(nlog(n) + mlog(m)) Time and O(N) Extra Space) 
//
//	 Insert elements of both arrays in a map as keys.
//	 Print the keys of the map.
	 public static void mergeArrays(int a[], int b[], int n, int m)
	    {
	       
	        // Declaring a map.
	        // using map as a inbuilt tool
	        // to store elements in sorted order.
	        Map<Integer,Boolean> mp = new TreeMap<Integer,Boolean>();
	       
	        // Inserting values to a map.
	        for(int i = 0; i < n; i++)
	        {
	            mp.put(a[i], true);
	        }
	        for(int i = 0;i < m;i++)
	        {
	            mp.put(b[i], true);
	        }
	       
	        // Printing keys of the map.
	        for (Map.Entry<Integer,Boolean> me : mp.entrySet())
	        {
	            System.out.print(me.getKey() + " ");
	        }
	    }

	public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int n1 = arr1.length;
     
        int[] arr2 = {2, 4, 6, 8};
        int n2 = arr2.length;
     
        int[] arr3 = new int[n1+n2];
         
        mergeArrays(arr1, arr2, n1, n2, arr3);
     
        System.out.println("Array after merging");
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");


	}

}
