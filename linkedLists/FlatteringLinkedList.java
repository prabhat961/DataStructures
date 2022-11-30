package linkedLists;

import java.util.ArrayDeque;
import java.util.Queue;

//Problem Statement:Given a linked list where every node represents a linked list and contains
//two pointers of its type: 
//	(i) Pointer to next node in the main list (we call it ‘right’ pointer in the code below) 
//	(ii) Pointer to a linked list where this node is headed 

//Approach 1:  maintaina queue inster the down nodes in the queue and poll and print once the node in
//the linked list have no next node in them
public class FlatteringLinkedList {
public static Node flatterLL(Node head) {
	Node curr = head;
	Queue<Node>q = new ArrayDeque<>();
	while(curr != null) {
	if(curr.next == null) {
		curr.next = q.poll();
	}
	if(curr.child != null) {
		q.add(curr.child);
	}
	curr = curr.next;
	}
	return head;
	}
//Approach 2: Optimized one: https://www.techiedelight.com/flatten-multilevel-linked-list/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
