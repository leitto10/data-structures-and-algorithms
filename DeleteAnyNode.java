
public class DeleteAnyNode {
	
	public static void InorderTraversal(Node root) {
		if(root != null) {
			InorderTraversal(root.left);
			System.out.print(root.data + " ");
			InorderTraversal(root.right);
		}
	}
	
	public static int MinValue(Node root) {
		int minv = root.data; 
		
		while(root.left != null) {
			minv = root.left.data; 
            root = root.left;
		}
		return minv;
	}
	
	// delete any node in the tree
	public static Node DeleteNode(Node root, int value) {
		// check if the tree is empty
		if(root == null) return root;
		
		//Otherwise, recur down the tree
		if(value < root.data)
			root.left = DeleteNode(root.left, value);
		else if(value > root.data)
			root.right = DeleteNode(root.right, value);
		// if key is same as root's key, then This is the node 
        // to be deleted
		else {
			// node with only one child or no child 
			if(root.right == null)
				return root.left;
			else if(root.left == null)
				return root.right;
			// node with two children: Get the in order successor (smallest 
            // in the right subtree)
			root.data = MinValue(root.right);
			// Delete the in order successor 
            root.right = DeleteNode(root.right, root.data); 
		}
		
		return root;
	}

	public static void main(String[] args) {
		//       13
		//      /  \
		//     4   20
		//    / \  / \
		//   2  5 18  70
		//              \      
		//              
		
		// Tree in example 1
		Node root = new Node(13);
		root.left = new Node(4);
		root.right = new Node(20);
		root.left.left = new Node(2);
		root.left.right = new Node(5);
		root.right.left = new Node(18);
		root.right.right = new Node(70);
		//root.right.right.right = new Node(80);
		
		InorderTraversal(root);
		System.out.print("\nDeleting a node: ");
		DeleteNode(root, 13);
		
		System.out.print("\n");
		InorderTraversal(root);

	}

}
