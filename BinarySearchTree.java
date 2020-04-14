
public class BinarySearchTree {
	// Root of BSTree
	Node root;
	
	// BinarySearchTree
	public BinarySearchTree() {
		root = null;
	}
	
	public void insert(Node current, int value) {
        if (value < current.value) { 
        	if (current.left != null) { 
        		insert(current.left, value); 
        	} else { 
        		System.out.println(" Inserted " + value + " to left of " + current.value); 
        		current.left = new Node(value); 
        		} 
        	} else if (value > current.value) {
          if (current.right != null) {
            insert(current.right, value);
          } else {
            System.out.println("  Inserted " + value + " to right of "
                + current.value);
            current.right = new Node(value);
          }
        }
      }
	
	public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
     }

	
	
	
	

}
