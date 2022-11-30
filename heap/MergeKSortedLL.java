package heap;


import java.util.*;

public class MergeKSortedLL {
	
	public Node mergeLinkedLIst(Node[] arr) {
		 
		Queue<Node> q = new PriorityQueue<Node>((a,b) -> a.val - b.val);
	        // only head pointer of all lists are added
	        for(Node l : lists){
	            if(l!=null){
	                q.add(l);
	            }        
	        }
	        ListNode head = new ListNode(-1);
	        ListNode point = head;
	        while(!q.isEmpty()){ 
	            point.next = q.poll();
	            point = point.next; 
	            if(point.next!=null){
	                q.add(point.next); // add next of current smallest
	            }
	        }
	        return head.next;
	    }

	}

	public static void main(String[] args) {
		

	}

}
