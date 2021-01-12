package Tress;
import java.util.*;
/*
 * given two binary search trees, determine wither they
 * have the same inorder traversal
 * 
 * Time complexity is O(n + m)
 * Space complexity is O(n + m)
 * 
 * */
public class SameInOrderTraversal {
	
	public static void inOrderTraversal(Node root, List<Integer> list) {
		if(root != null) {
			inOrderTraversal(root.left, list);
			//System.out.print(root.data + " ");
			list.add(root.data);
			inOrderTraversal(root.right, list);
		}
	}
	
	public static boolean inOrderCheck(Node root, List<Integer> list) {
		if(root == null) return true;
		if(!inOrderCheck(root.left, list)) {
			return false;
		}
		
		if(list.isEmpty() || list.get(0) != root.data) {
			return false;
		}
		list.remove(0);
		
		return inOrderCheck(root.right, list);
	}
	
	public static boolean inOrderCheck2(Node root, List<Integer> list) {
		return inOrderCheck(root, list) && list.isEmpty();
	}

	public static void main(String[] args) {
		/*        tree1            tree 2
		 *          
		 *          5                3
		 *        /   \            /   \
		 *       3     7          1     6
		 *      / \   / \              / \
		 *     1     6                5   7
		 * */
		Node tree1 = new Node(5);
		tree1.left = new Node(3);
		tree1.left.left = new Node(1);
		tree1.right = new Node(7);
		tree1.right.left = new Node(6);
		
		Node tree2 = new Node(3);
		tree2.left = new Node(1);
		tree2.right = new Node(6);
		tree2.right.left = new Node(5);
		tree2.right.right = new Node(7);
		
		List<Integer> list1 = new ArrayList<>();
		//List<Integer> list2 = new ArrayList<>();
		
		inOrderTraversal(tree1, list1);
		//inOrderTraversal(tree2, list2);
		
		System.out.print("\n");
		//System.out.print(list1.equals(list2));
		System.out.print(inOrderCheck2(tree2, list1));

	}

}
