package linkedLists;

import java.util.HashSet;

//Problem Statement:There are two singly linked lists in a system. By some programming error, the end
//node of one of the linked list got linked to the second list, forming an inverted Y shaped list.
//Write a program to get the point where two linked list merge. 
//TC: O(m+n)
//SC O(n)
public class IntersectionPoint {
	//Method 1: Hashing:	
	public static int printInterSection(Node head1, Node head2) {
		HashSet<Node>s = new HashSet<>();
		Node curr = head1;
		while(curr != null) {
			s.add(curr);
			curr= curr.next;
		}
		curr = head2;
		while(curr != null) {
			if(s.contains(curr))
				return curr.data;
			curr = curr.next;
		}
		return -1;
	}
	//Methode 2: 
//	Count Len of both linked list
//	Substract those two
//	Start itrating the first  leaving the diffrence of substraction result
//	compare both pointers node
//	common one is the intersection point
//	TC:O(m+n)
//	SC: O(1)
	
	
	
	public static void main(String[] args) {
		Node newNode; 
	    
    	Node head1 = new Node(10); 
    
    	Node head2 = new Node(3); 
    
    	newNode = new Node(6); 
    	head2.next = newNode; 
    
    	newNode = new Node(9); 
    	head2.next.next = newNode; 
    
    	newNode = new Node(15); 
    	head1.next = newNode; 
    	head2.next.next.next = newNode; 
    
    	newNode = new Node(30); 
    	head1.next.next = newNode; 
    
    	head1.next.next.next = null; 
    
    	System.out.print(printInterSection(head1, head2)); 
    }
}


