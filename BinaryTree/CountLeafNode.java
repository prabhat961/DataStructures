package BinaryTree;

public class CountLeafNode {
	
	public static int getLeafCount(Node root) {
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
			return 1;
		else
			return(getLeafCount(root.left) + getLeafCount(root.right));
	}

	public static void main(String[] args) {
		  Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
          
        /* get leaf count of the above tree */
        System.out.println("The leaf count of binary tree is : "
                             + getLeafCount(root));

	}

}
