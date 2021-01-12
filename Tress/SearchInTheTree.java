package Tress;

/*
 * Given the root node of a binary search tree (BST) and a value. 
 * You need to find the node in the BST that the node's value equals the given value. 
 * Return the subtree rooted with that node. If such node doesn't exist, 
 * you should return NULL.
 * */

public class SearchInTheTree {
	
	public static Node searchInTree(Node root, int value) {
		// base case, check if the tree is empty
		if(root == null) return root;
		
		// traverse down the tree
		if(value < root.data) {
			return searchInTree(root.left, value);
		}else if(value > root.data) {
			return searchInTree(root.right, value);
		}else {
			return root;
		}
	}
	
	public static void inOrderTraversal(Node root) {
		if(root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.data + " ");
			inOrderTraversal(root.right);
		}
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

		Node result = searchInTree(root, 20);
		inOrderTraversal(result);
	}

}
