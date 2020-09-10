
public class BinarySearchTree {
	Node root;

	public BinarySearchTree() {
		root = null;
	}
	
	//Insert nodes to the tree
	public Node InsertNode(Node root, int value) {
		// Checking if the tree is node
		if(root == null) {
			root = new Node(value);
			return root;
		}
		
		// Otherwise traverse the tree
		if(value < root.value)
			root.left = InsertNode(root.left, value);
		else if(value > root.value)
			root.right = InsertNode(root.right, value);
		
		return root;
	}
	public void Insert(int value) {
		root = InsertNode(root, value);
	}

	// Traverse in InOrder
	public void TraverseInOrder(Node node) {
		if(node != null) {
			TraverseInOrder(node.left);
			System.out.print(node.value + " ");
			TraverseInOrder(node.right);
		}
	}
	public void InOrder() {
		System.out.println("Traverse the tree in Order");
		TraverseInOrder(root);
		System.out.println(" ");
	}
	
	// Traverse in PreOrder
	public void TraversePreOrder(Node node) {
		if(node != null) {
			System.out.print(node.value + " ");
			TraversePreOrder(node.left);
			TraversePreOrder(node.right);
		}
	}
	public void PreOrder() {
		System.out.println("Treaverse the tree in PreOrder");
		TraversePreOrder(root);
		System.out.println(" ");
	}
	
	// Traverse in PostOrder
	public void TraversePostOrder(Node node) {
		if(node != null) {
			TraversePostOrder(node.left);
			TraversePostOrder(node.right);
			System.out.print(node.value + " ");
		}
	}
	public void PostOrder() {
		System.out.println("Treaverse the tree in PotOrder");
		TraversePostOrder(root);
		System.out.println(" ");
	}
	
	// Delete a node from the tree
	public Node DeleteNode(Node root, int value) {
		// If the tree is empty
		if(root == null) {
			return root;
		}
		
		/* Otherwise, recur down the tree */
		if(value < root.value)
			root.left = DeleteNode(root.left, value);
		else if(value > root.value)
			root.right = DeleteNode(root.right, value);
		
		// if key is same as root's key, then This is the node 
        // to be deleted 
		else {
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
		}
		return root;
	}
	public void Delete(int value) {
		System.out.print("Node deleted " + value);
		DeleteNode(root, value);
		System.out.println(" ");
	}
	

}



