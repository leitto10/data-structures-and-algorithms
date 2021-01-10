package Tress;

/*
 * Given the roots of two binary trees p and q, write a function to check if 
 * they are the same or not. Two binary trees are considered the same if they 
 * are structurally identical, and the nodes have the same value.*/

public class SameTree {
	
	// Time Complexity is O(n) since all nodes of both trees are visited in the worst case.
	// Space Complexity is O(1)
	public static boolean sameTree(Node p, Node q) {
		// check if the two roots value are the same
		if(p == null && q == null) {
			return true;
		}else if(p == null || q == null) {
			return false;
		}else if(p.data == q.data) {
			return sameTree(p.left, q.left) && sameTree(p.right, q.right);
		}else {
			return false;
		}
	
	}

	public static void main(String[] args) {
		/*          tree1               tree2
		 * 
		 *           15                  15
		 *          /   \               /   \
		 *        10    20             10    20
		 *        / \   / \           / \   /  \
		 *       8  12 16  25        8  12 16  25
		 * */
		//Node root = null;
		//Node root2 = null;
		
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
 
        Node root2 = new Node(15);
        root2.left = new Node(10);
        root2.right = new Node(20);
        root2.left.left = new Node(8);
        root2.left.right = new Node(12);
        root2.right.left = new Node(16);
        root2.right.right = new Node(25);

        System.out.print(sameTree(root, root2));
	}

}
