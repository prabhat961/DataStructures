package BinaryTree;

public class IdenticalTree {
	  public static boolean identicalTrees(Node a, Node b){
	        /*1. both empty */
	        if (a == null && b == null)
	            return true;
	             
	        /* 2. both non-empty -> compare them */
	        if (a != null && b != null)
	            return (a.data == b.data
	                    && identicalTrees(a.left, b.left)
	                    && identicalTrees(a.right, b.right));
	  
	        /* 3. one empty, one not -> false */
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
