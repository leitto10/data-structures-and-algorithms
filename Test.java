

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
        Node root = new Node(7);
        
        System.out.println("Building tree with root value " + root.value);
        tree.insert(root, 5);
        tree.insert(root, 4);
        tree.insert(root, 6);
        tree.insert(root, 9);
        tree.insert(root, 8);
        tree.insert(root, 10);
        tree.insert(root, 2);
        System.out.println(" ");
        
        System.out.println("Traversing tree in order");
        tree.traverseInOrder(root);
        System.out.println(" ");
        
        System.out.println("Traversing tree in pre order");
        tree.traversePreOrder(root);
        System.out.println(" ");
        
        System.out.println("Traversing tree in post order");
        tree.traversePostOrder(root);
        System.out.println(" ");
    	
    }
}