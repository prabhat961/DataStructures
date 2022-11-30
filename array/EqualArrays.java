package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Problem Statement:Given two given arrays of equal length, the task is to find if given arrays are
//equal or not. Two arrays are said to be equal if both of them contain the same set of elements, 
//arrangements (or permutation) of elements may be different though.

//Approach 1: A simple solution is to sort both arrays and then linearly compare elements.

public class EqualArrays {
	
	public static boolean checkEqual(int[] arr1,int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if( m != n)
			return false;
			for(int i  = 0; i < m; i++)
				if (arr1[i] != arr2[i])
	                return false;
			
		return true;
//		Time Complexity: O(n log n) 
//		Auxiliary Space: O(1)
	}
	
//Approach 2: An Efficient Solution to this approach is to use hashing. We store all elements of arr1[]
//and their counts in a hash table. Then we traverse arr2[] and check if the count of every element in
//arr2[] matches with the count in arr1[].
	
	public static boolean areEqual(int[] arr1,int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if( m != n)
			return false;
		Map<Integer, Integer> map
        = new HashMap<Integer, Integer>();
    int count = 0;
    for (int i = 0; i < n; i++) {
        if (map.get(arr1[i]) == null)
            map.put(arr1[i], 1);
        else {
            count = map.get(arr1[i]);
            count++;
            map.put(arr1[i], count);
        }
        for (int j = 0; j < n; j++) {
            // If there is an element in arr2[], but
            // not in arr1[]
            if (!map.containsKey(arr2[j]))
                return false;
            if (map.get(arr2[j]) == 0)
                return false;
 
            count = map.get(arr2[j]);
            --count;
            map.put(arr2[j], count);
        }
    }
    return true;
//    Time Complexity: O(n) 
//    Auxiliary Space: O(n)
}

	public static void main(String[] args) {
		int arr1[] = { 3, 5, 2, 5, 2 };
        int arr2[] = { 2, 3, 5, 5, 2 };
 
        if (checkEqual(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");

	}

}
