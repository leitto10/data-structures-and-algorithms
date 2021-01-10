package Tress;
import java.util.*;

public class InvertATree {
	// Invert the given Binary Tree
	// Because of recursion, O(h) function calls will be placed on the stack in the 
	// worst case, where h is the height of the tree. the space complexity is O(n).
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
	
	// Since each node in the tree is visited / added to the queue only once, the time 
	// complexity is O(n), where n is the number of nodes in the tree.
	// Space complexity is O(n), since in the worst case, the queue will 
	// contain all nodes in one level of the binary tree.
	public static Node iterativeInvert(Node root) {
		if(root == null) return root;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			Node temp = current.left;
			current.left = current.right;
			current.right = temp;
			
			if(current.left != null) queue.add(current.left);
			if(current.right != null) queue.add(current.right);
		}
		return root;
	}
	
	// Given a Binary Tree, convert it into its mirror.
	// Runtime Complexity Linear, O(n). Every sub-tree needs to be mirrored so 
	// we visit every node once and mirror the sub-tree starting there. 
	// Hence run time complexity is O(n).Memory ComplexityLinear, O(n) in the worst case.
	public static void mirror(Node root) {
		if(root == null) return;
		
		// We will do a post-order traversal of the binary tree.
		if(root.left != null) {
			mirror(root.left);
		}
		
		if(root.right != null) {
			mirror(root.right);
		}
		
		// Let's swap the left and right nodes at current level.
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
	
	public static void InorderTraversal(Node root) {
		if(root != null) {
			InorderTraversal(root.left);
			System.out.print(root.data + " ");
			InorderTraversal(root.right);
		}
	}

	public static void main(String[] args) {
		//
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
		
//		System.out.println("\nInverting the tree: ");
//		InvertTree(root);
//		InorderTraversal(root);
		
		System.out.println("\nInverting the tree iterative: ");
		iterativeInvert(root);
		InorderTraversal(root);
		
//		System.out.println("\nInverting the tree: ");
//		mirror(root);
//		InorderTraversal(root);
		
	}

}
