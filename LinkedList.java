import java.util.HashSet;

/* *********************************************************************************
 * Program Name:		Linked List
 * Date Created:		September 13, 2020
 * Author(s): 		    Jose L Lopez
 * Title: 		        Linked List
 * Description:         
 * *********************************************************************************/
public class LinkedList {
	// Java program to implement 
	// a Singly Linked List
	IntNode head;
	
	// Method inserts a node at the end of the list
	public void InsertNode(int data) {
		// If the Linked List is empty, 
        // then make the new node as head
		if(head == null) {
			head = new IntNode(data);
			return;
		}
		IntNode current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new IntNode(data);
	}
	
	// Insert at the start of the list
	public void InsertAtStart(int data) {
		IntNode newHead = new IntNode(data);
		newHead.next = head;
		head = newHead;
	}
	
	// Insert at any location
	public void InsertAtLocation(int index, int data) {
		IntNode node = new IntNode(data);
		if(index == 0) {
			InsertAtStart(data);
		}else {
		
		IntNode n = head;
		for(int i=0; i<index-1; i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
		}
	}
	
	// This method deletes a node by its value
	public void DeleteNode(int data) {
		if(head.data == data) {
			head = head.next;
			return;
		}
		IntNode current = head;
		while(current.next != null) {
			if(current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	// Method that prints the LinkedList
	public void PrintList() {
		IntNode currentNode = head;
		System.out.print("LinkedList: " + "\n");
		while(currentNode != null) {
			System.out.print(currentNode.data + " --> ");
			currentNode = currentNode.next;
		}
		System.out.println("\n");
	}
	
	// remove duplicates from unsorted linked list
	// Time Complexity: O(n^2)
	public void RemoveDup() {
		System.out.print("Removing duplicates Time Complexity: O(n^2) \n");
		if(head == null) return;
			
		IntNode current = head;
		IntNode temp = null, index = null;
		while(current != null) {
			temp = current;
			index = current.next;
			while(index != null) {
				if(current.data == index.data) {
					temp.next = index.next;
				}else {
					temp = index;
				}
				index = index.next;
			}
			current = current.next;
		}
	}
	
	// remove duplicates hash set
	//Time Complexity: O(n)
	public void RemoveDuplicates() {
		System.out.print("Removing duplicates Time Complexity: O(n) \n");
		if(head == null) return;
			
		IntNode current = head;
		IntNode temp = null;
			
		HashSet<Integer> storage = new HashSet<>();
		while(current != null) {
			if(storage.contains(current.data)) {
				temp.next = current.next;
			}else {
				storage.add(current.data);
				temp = current;
			}
			current = current.next;
		}
	}
	
	// Reverse the Linked List
	public void ReverseList() {
		IntNode current = head;
		IntNode prev = null, index = null;
		
		while(current != null) {
			index = current;
			current = current.next;
			// Reverse the reference / pointer
			index.next = prev;
			prev = index;
			head = index;
		}
	}
	
	// Time Complexity: O(n) where n is the length of linked list.
	// Implement an algorithm to find the nth to last element of a singly linked list
	public void NthLastElement(int value) {
		IntNode current = head;
		IntNode temp = head;
		int count = 0;
		
		if(head != null) {
			while(count < value) {
				if(temp == null) {
					System.out.print(value + " is larger than the lenght of out linked list.");
					return;
				}
				temp = temp.next;
				count++;
			}
			while(temp != null) {
				current = current.next;
				temp = temp.next;
			}
			
			System.out.print("The position element "+ value + " from the last is "+ current.data);
		}
		
	}
	
	// main method that runs our program
	public static void main(String[] args) {
		// Creating a LinkedList object
    	LinkedList mylist = new LinkedList();
    	
    	mylist.InsertNode(6);
    	mylist.InsertNode(2);
    	mylist.InsertNode(6);
    	mylist.InsertNode(2);
    	mylist.InsertNode(5);
    	mylist.InsertNode(10);
    	mylist.InsertNode(3);

    	//mylist.InsertAtLocation(2, 9);
    	
    	//mylist.InsertAtStart(77);
    	//mylist.DeleteNode(6);
    	
    	mylist.PrintList();
    	mylist.DeleteNode(3);
    	
    	//mylist.ReverseList();
    	
    	mylist.RemoveDuplicates();
    	mylist.PrintList();
    	
    	mylist.NthLastElement(5);
	
	
	
	}
	
}


















