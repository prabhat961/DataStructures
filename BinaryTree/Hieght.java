package BinaryTree;

public class Hieght {
	public static int maxDepth(Node root) {
		if(root == null)
			return -1;
		else {
		
		int lDepth = maxDepth(root.left);
		int rDepth = maxDepth(root.right);
		
//		if(lDepth > rDepth)
//			return (lDepth + 1);
//		else
//			return (rDepth + 1);
		return (Math.max(lDepth, rDepth) + 1);
		}
	}

	public static void main(String[] args) {
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	System.out.println("Hieght of the tree is:"+maxDepth(root));

	}

}
