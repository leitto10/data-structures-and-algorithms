

public class Test {
    
    public static void main(String[] args) {
    	
    	// Creating a LinkedList object
    	//LinkedList mylist = new LinkedList();
    	
    	//mylist.InsertNode(6);
    	//mylist.InsertNode(2);
    	//mylist.InsertNode(5);
    	//mylist.InsertNode(10);
    	//mylist.InsertNode(3);
    	//mylist.InsertAt(2, 9);
    	//mylist.InsertAtStart(77);
    	//mylist.DeleteNode(6);
    	
    	//mylist.PrintList();
    	
    	// Binary Search Tree
    	BinarySearchTree tree = new BinarySearchTree();
        Node root = new Node(5);
        
        System.out.println("Building tree with root value " + root.value);
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 3);
        tree.insert(root, 9);
        
        System.out.println("Traversing tree in order");
        tree.traverseInOrder(root);
    	
    	
    }
}