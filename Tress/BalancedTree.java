package Tress;

/*
 * Implement a function to check if a tree is balanced For the purposes of 
 * this question, a balanced tree is defined to be a tree such that no two leaf 
 * nodes differ in distance from the root by more than one
 * */
public class BalancedTree {
	// Modified height function
    // Returns the height of tree if the tree is balanced and 
	// returns -1 is the tree is not balanced
	// Time Complexity = O(n)
	
	public static int getHeight(Node root) {
		// Empty tree is always balanced
		if(root == null) return 0;
		
		else {
			// get height of left subtree, and check if it is balanced
			int lf = getHeight(root.left);
			if(lf == -1) {
				// Left subtree is unbalanced
				return -1;
			}
			// get height of right subtree, and check if it is balanced
			int rt = getHeight(root.right);
			if(rt == -1) {
				// Right subtree is unbalanced
				return -1;
			}
			
			if(Math.abs(lf - rt) <= 1) {
				// Balanced tree, return the height
				return Math.max(lf, rt) + 1;
			}
			// Unbalanced tree
			return -1;
		}
	}
	
	private static boolean isBalanced(Node root) {
        // Call the modified height function
        int height = getHeight(root);
        if (height == -1) {
            // Unbalanced tree
            return false;
        }
        // Balanced tree
        return true;
    }
	
	public static void Inorder(Node root) {
		if(root != null) {
			Inorder(root.left);
			System.out.print(root.data + " ");
			Inorder(root.right);
		}
	}

	public static void main(String[] args) {
		// Tree in example 1
//        Node root = new Node(18);
//        root.left = new Node(4);
//        root.right = new Node(20);
//        root.right.left = new Node(13);
//        root.right.right = new Node(70);
//        Inorder(root);
//
//        System.out.print("\n");
//        System.out.println(isBalanced(root));
        
        System.out.print("\n");
        
        // Tree in example 2
        Node root2 = new Node(3);
        root2.left = new Node(4);
        root2.right = new Node(8);
        root2.left.left = new Node(5);
        root2.left.right = new Node(9);
        root2.right.right = new Node(7);
        root2.right.right.left = new Node(6);
        Inorder(root2);
        
        System.out.print("\n");
        System.out.println(isBalanced(root2));

	}

}
