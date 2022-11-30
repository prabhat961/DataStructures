package SearchingAndSorting;

public class BinarySearch {
	public static int searchBinary(int[] arr, int left, int right, int x) {
		if( right >= left) {
			int mid = left +( right - left)/2;
			if(arr[mid] == x)
				return mid;
			if(arr[mid] > x)
				return searchBinary(arr, left, mid -1, x);
			return searchBinary(arr, mid + 1, right, x);
			}
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = searchBinary(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);

	}

}
