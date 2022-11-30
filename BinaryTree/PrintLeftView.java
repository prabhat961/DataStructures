package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftView {
	//Method 1: Recursive
//	Time Complexity: The function does a simple traversal of the tree, so the complexity is O(n). 
//	Auxiliary Space: O(n), due to the stack space during recursive call.  
	static int maxLevel=0;
    public static void printLeftRec(Node root,int level){
        if(root==null)
            return;
        if(maxLevel<level){
            System.out.print(root.key+" ");
            maxLevel=level;
        }
        printLeftRec(root.left,level+1);
        printLeftRec(root.right,level+1);
    }
    
    public static void printLeftView(Node root){
        printLeftRec(root,1);
    }
//Method 2:Itrative
//    Time Complexity: O(n), where n is the number of nodes in the binary tree.
    public static void printLeft(Node root){
        if(root==null)
            return;
        Queue<Node > q=new LinkedList<>();q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(i==0)
                    System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
    }
	public static void main(String[] args) {
		 Node root=new Node(10);
	    	root.left=new Node(20);
	    	root.right=new Node(30);
	    	root.right.left=new Node(40);
	    	root.right.right=new Node(50);
	    	
	        printLeft(root);

	}

}
