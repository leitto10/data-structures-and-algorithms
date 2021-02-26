package Tress;

// Time complexity of this solutions is O(n), where n is the size of the BST
// Auxiliary space is O(i), Due to no use of any data structure for storing values.
public class InOrdersuccesor {
	
	// Helper function to find minimum value node in given BST
	public static Node findMinVal(Node root) {
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}
	
	// Iterative function to find an inorder successor for the given key in the BST
	public static Node findSuccesor(Node root, int value) {
		Node succ = null;
		
		while(true) {
			// if given key is less than the root node, visit left subtree
			if(value < root.data) {
				succ = root;
				root = root.left;
			}else if(value > root.data){
				// if given key is more than the root node, visit right subtree
				root = root.right;
			}else {
				// if node with key's value is found, the successor is minimum
				// value node in its right subtree (if any)
				if(root.left != null) {
					succ = findMinVal(root.right);
				}
				break;
			}
			//if the key doesn't exits in the tree
			if(root == null)
				return null;
		}
		
		return succ;
	}
	
	
	public static void inOrderTraversal(Node root) {
		if(root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.data + " ");
			inOrderTraversal(root.right);
		}
	}

	public static void main(String[] args) {
		/* Construct below tree
		        15
		      /    \
		     /      \
		    10       20
		   /  \     /  \
		  /    \   /    \
		 8     12 16    25
		*/
		Node root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
		root.right.right = new Node(25);
		
		inOrderTraversal(root);
		System.out.print("\n");
		
//		Node min = findMinVal(root);
//		System.out.print(min.data);
		
		Node sucessor = findSuccesor(root, 16);
		if(sucessor != null) {
			System.out.print("The successor is: " + sucessor.data);
		}else {
			System.out.print("The successor does not exist: ");
		}
		
		/*
		 * Successor of 
		 * 15 is 16
		 * 10 is 12
		 * 20 is 25
		 *  8 is 10
		 * 12 is 15
		 * 16 i 20
		 * 25 does not exist             
		 * */

	}

}
