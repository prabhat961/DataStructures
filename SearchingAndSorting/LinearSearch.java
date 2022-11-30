package SearchingAndSorting;

public class LinearSearch {
	
	public static int searchLinear(int[] arr, int x) {
		int n = arr.length;
		for (int i = 0; i < n ; i++) {
			if( arr[i] == x)
				return i;
		}
		return n-1;
	}

	public static void main(String[] args) {
		int[] arr = {12, 43, 23, 54, 98, 90, 31};
		int x = 43;
		System.out.println(searchLinear(arr, x));

	}

}
