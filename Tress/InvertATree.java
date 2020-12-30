package Tress;


public class InvertATree {
	
	public static void InorderTraversal(Node root) {
		if(root != null) {
			InorderTraversal(root.left);
			System.out.print(root.data + " ");
			InorderTraversal(root.right);
		}
	}
	
	public static Node InvertTree(Node root) {
		if(root == null) return root;
		
		else {
			// Otherwise, recur down the tree
			Node lf = InvertTree(root.left);
			Node rt = InvertTree(root.right);
			/* swap the left and right pointers */
			root.left = rt;
			root.right = lf;
			
			return root;
		}
	}

	public static void main(String[] args) {
		// traversing the tree
		//           2                  2
		//          / \                / \
		//         1   4    --->      4   1
		//            / \            / \
		//           3   5          5   3
		
		Node root = new Node(2);
		root.left = new Node(1);
		root.right = new Node(4);
		root.right.left = new Node(3);
		root.right.right = new Node(5);
		
		InorderTraversal(root);
		System.out.println("\nInverting the tree: ");
		InvertTree(root);
		InorderTraversal(root);
	}

}
