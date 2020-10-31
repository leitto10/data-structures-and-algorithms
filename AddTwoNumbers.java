
//2.4 You have two numbers represented by a linked list, where each node contains a sin- gle 
//digit The digits are stored in reverse order, such that the 1’s digit is at the head of 
//the list Write a function that adds the two numbers and returns the sum as a linked list
// Adds contents of two linked  lists and return the head node  of resultant list

public class AddTwoNumbers {
	
	public static IntNode AddNumbers(IntNode l1, IntNode l2) {
		
		IntNode result = null, newHead = null;
		int carry = 0;
		
		while(l1 != null || l2 != null) {
			int sum = 0;
			
			if(l1 != null) {
				sum += l1.data;
				l1 = l1.next;
			}
			
			if(l2 != null) {
				sum += l2.data;
				l2 = l2.next;
			}
			
			sum += carry;
			carry = sum /10; // 1
			
			int value = sum % 10; // 1
			
			IntNode node = new IntNode(value);
			
			if(result != null) {
				result.next = node;
				result = result.next;
			}else {
				result = newHead = node;
			}

		}
		
		if(carry > 0) {
			result.next = new IntNode(carry);
		}
		
		return newHead;
		
	}
	
	// method that prints the list
	public static void PrintList(IntNode node) {
		IntNode current = node;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		
		IntNode l1 = new IntNode(5);
		l1.next = new IntNode(5);
		PrintList(l1);
		
		IntNode l2 = new IntNode(4);
		l2.next = new IntNode(5);
		PrintList(l2);
		
		IntNode result = AddNumbers(l1, l2);
		PrintList(result);

	}

}
