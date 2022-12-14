package Hashing;

import java.util.HashMap;

//Problem Statement: Given an array, print all subarrays in the array which has sum 0.
public class ZeroSumSubArray {
	public static int countSubArray(int[] arr) {
		int count = 0;
		HashMap<Integer, Integer>map = new HashMap<>();
		int i = -1;
		int sum = 0;
		map.put(0, 1);
		while(i < arr.length -1) {
			i++;
			sum += arr[i];
		if(map.containsKey(sum)) {
			count += map.get(sum);
			map.put(sum, map.get(sum)+1);
		}
		else {
			map.put(sum, 1);
			}
		}
		return count;
	}
	public static void main(String[] args) {
		

	}

}
