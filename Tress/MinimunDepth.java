package Tress;

// The minimum depth of a binary tree is the number of nodes from 
// the root node to the nearest leaf node.
public class MinimunDepth {
	
	public static int minimunDepth(Node root) {
		// base case, check if the root is null
		if(root == null) {
			return 0;
		}else {
			// find minimum depth of the left subtree
			int lf = minimunDepth(root.left);
			// find minimum depth of the right subtree
			int rt = minimunDepth(root.right);
			
			// if the left child does not exist, consider the depth
	        // returned by the right subtree
			if(root.left == null)
				return rt + 1;
			// if right child does not exist, consider the depth
	        // returned by the left subtree
			else if(root.right == null)
				return lf + 1;
			
			return Math.min(lf, rt) + 1;
			
		}
	}

	public static void main(String[] args) {
		//       13
		//      /  \
		//     4    20
		//    / \   / \
		//         18  70    
		//              \
		//              80
		
		// Tree in example 1
		Node root = new Node(13);
		root.left = new Node(4);
		//root.left.left = new Node(2);
		//root.left.right = new Node(5);		
		root.right = new Node(20);
		root.right.left = new Node(18);
		root.right.right = new Node(70);
		root.right.right.right = new Node(80);
		
		System.out.print("The minimun deth of the tree is: " + minimunDepth(root));
		
		// Time complexity is O(n) where n is the # of nodes in the tree
		// Auxiliary Space is O(h) if we consider the call stack were h is
		// the height of the tree. Otherwise is O(1)

	}

}
