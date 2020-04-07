

public class Test {
    
    public static void main(String[] args) {
    	// Creating a LinkedList object
    	LinkedList mylist = new LinkedList();
    	
    	mylist.InsertNode(6);
    	mylist.InsertNode(2);
    	mylist.InsertNode(5);
    	mylist.InsertNode(10);
    	mylist.InsertNode(3);
    	
    	mylist.InsertAt(2, 9);
    	//mylist.InsertAtStart(77);
    	//mylist.DeleteNode(10);
    	mylist.PrintList();
    	
    }
}