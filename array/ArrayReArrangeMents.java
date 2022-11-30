package array;

import java.util.Arrays;

//Problem Statement: Given a sorted array of positive integers, rearrange the array alternately 
//i.e first element should be maximum value, second minimum value, third second max, fourth second min 
//and so on. 
//Approach: The idea is to use an auxiliary array. We maintain two pointers one to leftmost or smallest
//element and other to rightmost or largest element. We move both pointers toward each other and 
//alternatively copy elements at these pointers to an auxiliary array. Finally, we copy the auxiliary
//array back to the original array.

public class ArrayReArrangeMents {
	public static void reArrange(int[] arr,int n) {
		int[] temp = arr.clone();
		int lo = 0, hi = n -1;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
            if (flag)
                arr[i] = temp[hi--];
            else
                arr[i] = temp[lo++];
 
            flag = !flag;
	}
//		Time Complexity: O(n) 
//		Auxiliary Space: O(n) 
}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int size = arr.length;
		 
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));
 
        reArrange(arr, size);
 
        System.out.println("Modified Array ");
        System.out.println(Arrays.toString(arr));

	}

}
