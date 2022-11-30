package linkedLists;

import java.util.ArrayDeque;
import java.util.Deque;


public class PalindromLinkedList {
	//Approach 1: Naive:
	public static boolean isPalindrom(Node head) {
		Deque<Character> stack = new ArrayDeque<>();
		for( Node curr = head; curr != null; curr = curr.next) {
			stack.push((char) curr.data);
		}
		for(Node curr=head;curr!=null;curr=curr.next){
            if(stack.pop()!=curr.data)
                return false;
        }
        return true;
	}
	
	 static Node reverseList(Node head){
	        if(head==null||head.next==null)return head;
	        Node rest_head=reverseList(head.next);
	        Node rest_tail=head.next;
	        rest_tail.next=head;
	        head.next=null;
	        return rest_head;
	    }
	    
	    static boolean chkPalindrome(Node head){
	        if(head==null)return true;
	        Node slow=head,fast=head;
	        while(fast.next!=null&&fast.next.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        Node rev=reverseList(slow.next);
	        Node curr=head;
	        while(rev!=null){
	            if(rev.data!=curr.data)
	                return false;
	            rev=rev.next;
	            curr=curr.next;
	        }
	        return true;
	    }

	public static void main(String[] args) {
		  Node head=new Node('g');
	    	head.next=new Node('f');
	    	head.next.next=new Node('h');
	    	if(isPalindrom(head))
	    	    System.out.print("Yes");
	    	else
	    	    System.out.print("No");

	}

}
