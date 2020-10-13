
public class BinaryTree {
	// root of the tree
	Node root;

	public BinaryTree() {
		root = null;
	}
	
	// insert nodes to the tree
	public Node InsertNode(Node root, int value) {
		// If the tree is empty, return a new node
		if(root == null) {
			root = new Node(value);
			return root;
		}
		
		// Otherwise, recur down the tree
		if(value < root.data)
			root.left = InsertNode(root.left, value);
		else if(value > root.data)
			root.right = InsertNode(root.right, value);
		
		return root;
	}
	public void Insert(int value) {
		root = InsertNode(root, value);
	}
	
	// print in order traversal
	public void InOrderTraversal(Node root) {
		if(root != null) {
			InOrderTraversal(root.left);
			System.out.print(root.data + " ");
			InOrderTraversal(root.right);
		}
	}
	public void InOrder() {
		System.out.println("Treaverse the tree Inorder");
		InOrderTraversal(root);
		System.out.println("\n");
	}
	
	// Traverse the tree in PreOrder
	public void PreOrderTraver(Node root) {
		if(root != null) {
			System.out.print(root.data + " ");
			PreOrderTraver(root.left);
			PreOrderTraver(root.right);
		}
	}
	public void PreOrder() {
		System.out.println("Treaverse the tree in PreOrder");
		PreOrderTraver(root);
		System.out.println("\n");
	}
		
	// Traverse the tree in PostOrder
	public void PostOrderTraver(Node root) {
		if(root != null) {
			PostOrderTraver(root.left);
			PostOrderTraver(root.right);
			System.out.print(root.data + " ");
		}
	}
	public void PostOrder() {
		System.out.println("Treaverse the tree in PostOrder");
		PostOrderTraver(root);
		System.out.println("\n");
	}
	
	public int MinValue(Node root) {
		int minv = root.data; 
		
		while(root.left != null) {
			minv = root.left.data; 
            root = root.left;
		}
		return minv;
	}
	
	// delete any node in the tree
	public Node DeleteNode(Node root, int value) {
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
			// node with two children: Get the inorder successor (smallest 
            // in the right subtree)
			root.data = MinValue(root.right);
			// Delete the inorder successor 
            root.right = DeleteNode(root.right, root.data); 
		}
		
		return root;
	}
	public void Delete(int value) {
		System.out.print("Node Deleted: " + value + "\n");
		root = DeleteNode(root, value);
	}
	
	// invert the binary tree
	public Node InvertTree(Node root) {
		if(root == null) return root;
		
		// Otherwise, recur down the tree
		Node right = InvertTree(root.right);
		Node left = InvertTree(root.left);
		/* swap the left and right pointers */
		root.left = right;
		root.right = left;
		
		return root;
	}
	public void Invert() {
		System.out.print("Inverting the tree: \n");
		root = InvertTree(root);
	}
	
	// main method to run our project
	public static void main(String[] args) {
		BinaryTree mytree = new BinaryTree();
		BinaryTree tree2 = new BinaryTree();
		
		mytree.Insert(50);
		mytree.Insert(30);
		mytree.Insert(20);
		mytree.Insert(40);
		mytree.Insert(70);
		mytree.Insert(60);
		mytree.Insert(80);
		mytree.InOrder();
		mytree.PreOrder();
		mytree.PostOrder();
		
		// traversing the tree
		//           2                  2
		//          / \                / \
		//         1   4    --->      4   1
		//            / \            / \
		//           3   5          5   3
		tree2.Insert(2);
		tree2.Insert(1);
		tree2.Insert(4);
	    tree2.Insert(3);
		tree2.Insert(5);
		tree2.InOrder();
		
		tree2.Invert();
		tree2.InOrder();
		
	}

}
