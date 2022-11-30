package BinaryTree;
class Node{
	int key;
	Node left;
	Node right;
	Node(int item){
		key = item;
	}
}

public class Implementation {
	public static void inOrder(Node root) {
		if(root != null) {
			inOrder(root.left);
			System.out.print(root.key + " ");
			inOrder(root.right);
		}
	}
	
	public static void preOrder(Node root) {
		if(root != null) {
			System.out.print(root.key + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public static void postOrder(Node root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.key + " ");
		}
	}

	public static void main(String[] args) {
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	System.out.println("InOrder Traversal is:");
    	inOrder(root);
    	System.out.println();
    	System.out.println("PreOrder Traversal is:");
    	preOrder(root);
    	System.out.println();
    	System.out.println("PostOrder Traversal is:");
    	postOrder(root);

	}

}
