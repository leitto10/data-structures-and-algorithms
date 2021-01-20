package LinkedList;
/*
 * Merge two sorted linked lists and return it as a new sorted list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 * */
public class MergeTwoSortedList {
	
	public static IntNode mergeList(IntNode s1, IntNode s2) {
		// create a dummy node
		IntNode head = new IntNode(0);
		IntNode current = head;
		
		while(s1 != null && s2 != null) {
			if(s1.data < s2.data) {
				current.next = s1;
				s1 = s1.next;
			}else {
				current.next = s2;
				s2 = s2.next;
			}
			current = current.next;
		}
		
		if(s1 != null) {
			current.next = s1;
		}
		
		if(s2 != null) {
			current.next = s2;
		}
		
		return head.next;
	}
	
	public static void printList(IntNode s) {
		IntNode current = s;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		
		IntNode l1 = new IntNode(1);
		l1.next = new IntNode(3);
		l1.next.next = new IntNode(5);
		printList(l1);
		
		
		IntNode l2 = new IntNode(1);
		l2.next = new IntNode(2);
		l2.next.next = new IntNode(6);
		printList(l2);
		
		IntNode result = mergeList(l1, l2);
		printList(result);
		

	}

}
