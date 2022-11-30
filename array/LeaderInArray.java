package array;
// This Program is to print the Leader element in an array Leader element is an elemnt who is Greater
//than all the elements present at the right side of that element.
public class LeaderInArray {
	
	public static void printLeadernaive(int[] arr, int size) {
		for(int i = 0; i < size; i++) {
			int j;
			for(j = i + 1; j < size;j++) {
				if(arr[i] < arr[j])
					break;
			}
			if(j == size)
				System.out.print(arr[i] + " ");
		}
		//Time Complexity: O(n*n)
	}
	
	public static void printLeaderOptimize(int[] arr, int size) {
		int maxfromRIght = arr[size -1];
		System.out.println("Leader is :"+maxfromRIght);//RightMost Element is always Leader.
		
		for(int i = size -2; i >= 0; i--) {
			if(maxfromRIght < arr[i]) {
				maxfromRIght = arr[i];
				System.out.print(maxfromRIght+ " ");
			}
		}
		//Time Complexity: O(n)
	}
	

	public static void main(String[] args) {
		 int[] arr = {16, 17, 4, 3, 5, 2};
	        int n = arr.length;
	        printLeaderOptimize(arr, n);

	}

}
