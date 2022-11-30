package SearchingAndSorting;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(int[] arr) {
		int size = arr.length;
		for(int i = 0; i < size;i++) 
			for (int j = 0; j <size - i -1; j++) 
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j +1];
					arr[j + 1] = temp;
				}
		//Complexity: O(n2)
	}

	public static void main(String[] args) {
		int[] arr = { 32,10, 13, 65, 2, 43};
		System.out.println("Array before sorting:");
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println("Array After sorting:");
		System.out.println(Arrays.toString(arr));
		
	}

}
