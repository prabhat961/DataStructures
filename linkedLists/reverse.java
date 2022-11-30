package linkedLists;



public class reverse {
	
	public static Node RevLL(Node head) {
		Node prev = null;
		Node curr = head;
		while(curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	public static void printList(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}


	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
		System.out.println("Given Linked list");
		printList(head);
		head = RevLL(head);
		 System.out.println("");
	      System.out.println("Reversed linked list ");
	       printList(head);  

	}

}
