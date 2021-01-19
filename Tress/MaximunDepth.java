package Tress;

// The maximum depth of a binary tree is the number of nodes from the root down 
// to the farthest leaf node. In other words, it is the height of a binary tree.
public class MaximunDepth {
	// Time Complexity: O(n) 
	// Auxiliary Space : If we don’t consider size of stack for function 
	// calls then O(1) otherwise O(n).
	public static int maximunDepth(Node root) {
		// base case, check if the tree is null
		if(root == null) {
			return 0;
		}else {
			/* compute the depth of each subtree */
			int lf = maximunDepth(root.left);
			int rt = maximunDepth(root.right);
			
			/* use the larger one */
			if(lf > rt)
				return lf + 1;
			else
				return rt + 1;
			
			//return Math.max(lf, rt) + 1;
		}
	}

	public static void main(String[] args) {
		//       13
		//      /  \
		//     4    20
		//    / \   / \
		//   2   5 18  70    
		//              \
		//              80
		
		// Tree in example 1
		Node root = new Node(13);
		root.left = new Node(4);
		root.left.left = new Node(2);
		root.left.right = new Node(5);
				
		root.right = new Node(20);
		root.right.left = new Node(18);
		root.right.right = new Node(70);
		root.right.right.right = new Node(80);
		
		System.out.print("The max depth is : " + maximunDepth(root));

	}

}
