/* *********************************************************************************
 * Program Name:		EarthDay.java
 * Date Created:		March 4, 2018
 * Author(s): 		    Jose L Lopez
 * Title: 		        LinkedList
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
	
	// This method deletes a node by given index position
	public void DeleteNode(int data) {
		if(head == null) return;
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
		while(currentNode.next != null) {
			System.out.print(currentNode.data + " --> ");
			currentNode = currentNode.next;
		}
		System.out.println(currentNode.data);
	}
	
	// Remove duplicate elements in the list
	public void RemoveDuplicates() {
		//Node current will point to head
		IntNode current = head, temp = null, index = null;
		
		if(head == null) {
			return;
		}else {
			while(current.next != null) {
				// Node temp will point to previous node to index
				temp = current;
				// Index will point to node next to current
				index = current.next;
				
				while(index != null) {
					if(current.data == index.data) {
						//Here, index node is pointing to the node which is duplicate of current node  
                        //Skips the duplicate node by pointing to next node
						temp.next = index.next;
					}else {
						temp = index;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
}


















