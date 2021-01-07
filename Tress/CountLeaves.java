package Tress;

public class CountLeaves {
	// Given a Binary Tree of size N , You have to count leaves in it
	
	public static int countLeaveNodes(Node root) {
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null) {
			return 1;
		}else {
			return countLeaveNodes(root.left) + countLeaveNodes(root.right);
		}
	}

	public static void main(String[] args) {
		/* Construct below tree
		        1
		      /   \
			 2     3
		    / \   / \
		   4   5 6   9  
		       
		*/
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);    
		root.right.right = new Node(9);

		System.out.print("The number of leaves nodes are: " +
		countLeaveNodes(root));
	}

}
