package SearchingAndSorting;
//Problem Statement:An element in a sorted array can be found in O(log n) time via binary search. But
//suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand. So for 
//instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the rotated array in 
//O(log n) time.
//Approach:The idea is to find the pivot point, divide the array in two sub-arrays and perform binary
//search.
//The main idea for finding pivot is – for a sorted (in increasing order) and pivoted array, pivot
//element is the only element for which next element to it is smaller than it.
//Using the above statement and binary search pivot can be found.
//After the pivot is found out divide the array in two sub-arrays.
//Now the individual sub – arrays are sorted so the element can be searched using Binary Search.

public class SearchInRotated {
	static int pivotedBinarySearch(int arr[], int n, int key)
    {
        int pivot = findPivot(arr, 0, n - 1);
 
        // If we didn't find a pivot, then
        // array is not rotated at all
        if (pivot == -1)
            return binarySearch(arr, 0, n - 1, key);
 
        // If we found a pivot, then first
        // compare with pivot and then
        // search in two subarrays around pivot
        if (arr[pivot] == key)
            return pivot;
        if (arr[0] <= key)
            return binarySearch(arr, 0, pivot - 1, key);
        return binarySearch(arr, pivot + 1, n - 1, key);
    }
 
    /* Function to get pivot. For array
       3, 4, 5, 6, 1, 2 it returns
       3 (index of 6) */
    static int findPivot(int arr[], int low, int high)
    {
        // base cases
        if (high < low)
            return -1;
        if (high == low)
            return low;
 
        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }
 
    /* Standard Binary Search function */
    static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;
 
        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

	public static void main(String[] args) {
		int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr1.length;
        int key = 3;
        System.out.println("Index of the element is : "
                           + pivotedBinarySearch(arr1, n, key));

	}

}
