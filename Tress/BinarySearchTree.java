package Tress;


public class BinarySearchTree {
	// root of the tree
	public static Node root;
	
	public Node insertNode(Node root, int value) {
		//base case check if roo == null
		if(root == null) {
			root = new Node(value);
			return root;
		}
		
		if(value < root.data) 
			root.left = insertNode(root.left, value);
		else if(value > root.data)
			root.right = insertNode(root.right, value);
		
		return root;
		
	}
	
	// print in order traversal
	public static void inorderTraversal(Node root) {
		if(root != null) {
			inorderTraversal(root.left);
			System.out.print(root.data + " ");
			inorderTraversal(root.right);
		}
	}
	
	// Traverse the tree in PreOrder
	public static void PreOrderTraver(Node root) {
		if(root != null) {
			System.out.print(root.data + " ");
			PreOrderTraver(root.left);
			PreOrderTraver(root.right);
		}
	}
		
	// Traverse the tree in PostOrder
	public static void PostOrderTraver(Node root) {
		if(root != null) {
			PostOrderTraver(root.left);
			PostOrderTraver(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	// main method to run our project
	public static void main(String[] args) {
		//         50
		//        /  \
		//      30    70
		//     / \    / \
		//    20 40  60 80
		BinarySearchTree mytree = new BinarySearchTree();
		
		int[] arr = {30, 20, 40, 70, 60, 80};
		Node root = new Node(50);
		
		for(int i: arr) {
			mytree.insertNode(root, i);
		}
		
		System.out.println("Traversing the tree inorder");
		inorderTraversal(root);
		System.out.println("\nTraversing the tree in pre order");
		PreOrderTraver(root);
		System.out.println("\nTraversing the tree in post order");
		PostOrderTraver(root);
		
	}

}
