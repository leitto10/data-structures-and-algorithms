import java.util.*;

public class ArrayListProblems {
	//Write a method maxLength that takes an ArrayList of Strings as a parameter and 
	//that returns the length of the longest string in the list. If your method is 
	//passed an empty list, it should return 0.
	public static int maxLength(ArrayList<String> list) {
		int max = 0;
		for(int i=0; i<list.size(); i++) {
			String s = list.get(i);
			if(s.length() > max) {
				max = s.length();
			}
		}
		System.out.print("The string with max length: " + max);
		
		return max;
	}
	
	//Write a method removeEvenLength that takes an ArrayList of Strings as a parameter 
	//and that removes all of the strings of even length from the list.
	public static void removeEvenLength(ArrayList<String> list) {
		for(int i=0; i<list.size(); i++) {
			String s = list.get(i);
			if(s.length() % 2 == 0) {
				list.remove(s);
				i--;
			}
		}
		System.out.print(list);
	}
	
	//Write a method doubleList that takes an ArrayList of Strings as a parameter and 
	//that replaces every string with two of that string. For example, if the list 
	//stores the values {"how", "are", "you?"} before the method is called, it should 
	//store the values {"how", "how", "are", "are", "you?", "you?"} after the method 
	//finishes executing.
	public static void doubleList(ArrayList<String> list) {
		for(int i=0; i<list.size(); i+=2) {
			String s = list.get(i);
			list.add(i+1, s);
		}
		System.out.print(list);
	}
	
	//Write a method minToFront that takes an ArrayList of integers as a parameter and 
	//that moves the minimum value in the list to the front, otherwise preserving the 
	//order of the elements. For example, if a variable called list stores the following 
	//values: {3, 8, 92, 4, 2, 17, 9} and you make this call: minToFront(list); it should 
	//store the following values after the call: {2, 3, 8, 92, 4, 17, 9} You may assume 
	//that the list stores at least one value.
	public static void minToFront(ArrayList<Integer> array) {
	    int min = 0;
	    for (int i = 1; i < array.size(); i++) {
	        if (array.get(min) > array.get(i)) {
	            min = i;
	        }
	    }
	    int minValue = array.remove(min);
	    array.add(0, minValue); 
	    System.out.print(array);
	}
	
	//Write a method removeDuplicates that takes as a parameter a sorted ArrayList of 
	//Strings and that eliminates any duplicates from the list. For example, suppose 
	//that a variable called list contains the following values: 
	//{"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"} 
	//After calling removeDuplicates(list); the list should store the following values: 
	//{"be", "is", "not", "or", "question", "that", "the", "to"}

	//Because the values will be sorted, all of the duplicates will be grouped together
	public static void removeDuplicates(ArrayList<String> list) {
		for(int i=0; i<list.size()-1; i++) {
			if(list.get(i).equals(list.get(i+1))) {
				list.remove(i+1);
				i--;
			}
		}
		System.out.print(list);
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>(
				Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet"));
		
		maxLength(list1);
		System.out.print("\n");

		removeEvenLength(list1);
		System.out.print("\n");
		
		ArrayList<String> list2 = new ArrayList<String>(
				Arrays.asList("how", "are", "you?"));
		
		doubleList(list2);
		System.out.print("\n");
		
		ArrayList<Integer> list3 = new ArrayList<>(
				Arrays.asList(3, 8, 92, 4, 2, 17, 9));
		
		minToFront(list3);
		
		System.out.print("\nRemoving duplicates: \n");
		ArrayList<String> list4 = new ArrayList<>(
				Arrays.asList("be", "be", "is", "not", "or", "question", "that", "the", "to", "to"));
		
		removeDuplicates(list4);
	}

}
