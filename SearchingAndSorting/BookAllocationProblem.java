package SearchingAndSorting;
//Problem statement: Given number of pages in n different books and m students. The books are arranged
//in ascending order of number of pages. Every student is assigned to read some consecutive books. The
//task is to assign books in such a way that the maximum number of pages assigned to a student is 
//minimum. 
public class BookAllocationProblem {
	
	public static boolean isPossible(int[] arr, int n, int m, int curr_min) {
		int studentRequired = 1;
		int curr_sum = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] > curr_min)
				return false;
			if (curr_sum + arr[i] > curr_min) {
				studentRequired++;
				curr_sum = arr[i];
				if (studentRequired > m)
                    return false;
				else
					curr_sum += arr[i];
			}
		}
		return true;
	}
	
	public static int findPages(int[] arr, int n, int m) {
		long sum = 0;
		if(n < m)
			return -1;
		for( int i = 0; i < n; i++)
			sum += arr[i];

        int start = 0, end = (int) sum;
        int result = Integer.MAX_VALUE;
        
        while(start <= end) {
        	int mid =(start + end)/2;
        	if(isPossible(arr, n, m, mid)) {
        		result = mid;
        	end = mid - 1;
        }
        else
        	start = mid + 1;
        }
        return result;
	}
 
	public static void main(String[] args) {
		int[] arr = {12, 34, 67, 90};
        
        int m = 2; //No. of students
      
        System.out.println("Minimum number of pages = " +
                          findPages(arr, arr.length, m));


	}

}
