package SearchingAndSorting;

import java.util.Arrays;

public class QuickSort {
	public static void sort(int[] arr, int lo, int hi) {
		if( lo >= hi) {
			return;
		}
		int start = lo;
		int end = hi;
		int mid = start +(end - start)/2;
		int pivot = arr[mid];
		while(start <= end) {
			while(arr[start] < pivot) {
				start++;
			}
			while(arr[end] > pivot) {
				end--;
			}
			if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
			}
	}
		sort(arr, lo, end);
		sort(arr, start, hi);
}

	public static void main(String[] args) {
		int[] arr = { 32,10, 13, 65, 2, 43};
		System.out.println("Array before sorting:");
		System.out.println(Arrays.toString(arr));
		sort(arr,0, arr.length -1);
		System.out.println("Array After sorting:");
		System.out.println(Arrays.toString(arr));

	}

}
