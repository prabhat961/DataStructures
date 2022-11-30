package array;

public class EquibriumPiont {
	public static void printEquilibriumnaive(int[] arr, int size) {
		for(int i = 0; i < size; i++) {
			int leftSum = 0;
			int rightSum = 0;
			for(int j = 0; j < i; j++)
				leftSum = leftSum + arr[j];
			for(int k = i +1;k < size;k++)
				rightSum = rightSum + arr[k];
			if(leftSum == rightSum) {
				System.out.print(i);
				break;
			}
		}
		//Time Complexity: O(n*n) 
	}
	//Method 2: With Extra Space:
	public static int printEquilibriumElement(int[] arr, int size) {
		int[] prefixSum = new int[size];
		prefixSum[0] = arr[0];
		for( int i = 1; i < size; i++)
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		
		int[] suffixSum = new int[size];
		suffixSum[size - 1] = arr[size - 1];
        for (int i = size - 2; i >= 0; i--)
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        
        for(int i = 1; i < size;i++)
        	if(prefixSum[i] == suffixSum[i])
        		return arr[i];
        return -1;
		}
	
	//Method 3: both time and space efficient:
	public static int findEquilibriumElement(int arr[], int size)
    {
        int right_sum = 0, left_sum = 0;
        // Maintains left cumulative sum
        left_sum = 0;
         
        // Maintains right cumulative sum
        right_sum=0;
        int i = -1;
        int j = -1;
        for( i = 0, j = size-1 ; i < j ; i++, j-- ){
            left_sum += arr[i];
            right_sum += arr[j];
            
            while(left_sum < right_sum && i < j){
                i++;
                left_sum += arr[i];
            }
            while(right_sum < left_sum && i < j){
                j--;
                right_sum += arr[j];
            }
        }
        if(left_sum == right_sum && i == j)
            return arr[i];
        else
            return -1;
        }
    

	public static void main(String[] args) {
		int[] arr = {2, 9, 3, 4, 0, 3, 3, 2, 9, 1};
		int size = arr.length;
		//printEquilibriumnaive(arr, size);
		System.out.println("Equilibrium element is: "+findEquilibriumElement(arr, size));

	}

}
