package SearchingAndSorting;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr){
        int size = arr.length;
        for( int step = 0; step < size; step++){
            int key = arr[step];
            int j = step - 1;
            while( j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
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
