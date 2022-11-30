package array;

import java.util.Arrays;

//Problem Statement:Given the arrival and departure times of all trains that reach a railway station, 
//the task is to find the minimum number of platforms required for the railway station so that no train
//waits. 
//We are given two arrays that represent the arrival and departure times of trains that stop.
////Approach: Sort the arrival and departure times of trains.
//Create two pointers i=0, and j=0 and a variable to store ans and current count plat
//Run a loop while i<n and j<n and compare the ith element of arrival array and jth element of departure array.
//If the arrival time is less than or equal to departure then one more platform is needed so increase the count, i.e. plat++ and increment i
//Else if the arrival time greater than departure then one less platform is needed so decrease the count, i.e. plat– and increment j
//Update the ans, i.e ans = max(ans, plat).
public class MinimumPlatform {
	public static int findPlatform(int[] arr, int[] dep, int n) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int plat_needed = 1, result = 1;
		int i = 1, j = 0;
		while(i < n && j < n) {
			 if (arr[i] <= dep[j]) {
	                plat_needed++;
	                i++;
	            }
			 else if (arr[i] > dep[j]) {
	                plat_needed--;
	                j++;
	            }
			 if (plat_needed > result)
	                result = plat_needed;
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
        System.out.println("Minimum Number of Platforms Required = "
                           + findPlatform(arr, dep, n));
    

	}

}
