package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest {
	
	public static int kthLargest(int[] arr, int k) {
		PriorityQueue<Integer>pq = new PriorityQueue<>();
		for( int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for( int i = k; i < arr.length; i++) {
			if(pq.peek() < arr[i])
				pq.poll();
			pq.add(arr[i]);
		}
		return pq.peek();
	}
	
	public static int kthSmallest(int[] arr, int k) {
		if(arr == null || arr.length < k)
			return -1;
		
		PriorityQueue<Integer> mh = new PriorityQueue<>(Comparator.reverseOrder());
		for (int i = k; i < arr.length; i++) {
			if(arr[i] < mh.peek()) {
				mh.poll();
				mh.add(arr[i]);
			}
		}
		return mh.peek();
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60};
		int k = 3;
		System.out.print("kth Largest Number in this array is:"+kthLargest(arr, k));
		System.out.println();
		System.out.print("kth Smallest Number in this array is:"+kthSmallest(arr, k));
	}

}
