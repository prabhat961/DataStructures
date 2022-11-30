package Hashing;
//Problem Statement:Given a sorted array in which all elements appear twice (one after one) and one 
//element appears only once. Find that element in O(log n) complexity.

//A Simple Solution is to traverse the array from left to right. Since the array is sorted, we can 
//easily figure out the required element.
//Time Complexity: O(n)
//Space Complexity: O(1)

//An Efficient Solution can find the required element in O(Log n) time. The idea is to use Binary Search
//without recursion. All elements before the required have the first occurrence at even index 
//(0, 2, ..and so on) and the next occurrence at odd index (1, 3, ..and so on). 
public class ElementAppearOnce {
	public static int search(int[] arr) {
		int start = 0, end = arr.length -1, mid;
		if(arr.length == 1)
			return arr[0];// If only one element is in the array
		if(arr[start] != arr[start + 1])
			return arr[start];// If the first element is the element that appears only once
		if(arr[end] != arr[end -1])
			return arr[end]; // If Last element is the element that appears only once
					
					 while (start <= end) {
				            mid = start + (end - start) / 2;
				            // CASE 1
				            if (arr[mid] != arr[mid - 1]
				                && arr[mid] != arr[mid + 1])
				                return arr[mid];
				            // CASE 2 and CASE 3
				            else if ((arr[mid] == arr[mid + 1]
				                      && mid % 2 == 0)
				                     || (arr[mid] == arr[mid - 1]
				                         && mid % 2 != 0))
				                start = mid + 1;
				            // CASE 4 and CASE 5
				            else
				                end = mid - 1;
				        }
				        // If no such element found
				        return -1;
		}
//	Time Complexity: O(logn)
//	Auxiliary Space: O(1)

	public static void main(String[] args) {
		 int[] arr = { 1, 1, 2, 4, 4, 5, 5, 6, 6 };
		 
	        int element = search(arr);
	 
	        if (element != -1)
	            System.out.println("The required element is "
	                               + element);
	        else
	            System.out.println("There is no such element");

	}

}
