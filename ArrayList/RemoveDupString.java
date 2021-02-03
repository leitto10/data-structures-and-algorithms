package ArrayList;
/*
 * Write a method removeDuplicates that takes as a parameter a sorted ArrayList of Strings
 * and that eliminates any duplicates from the list. For example, suppose that a variable
 * called list contains the following values: 
 * {"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"} 
 * After calling removeDuplicates(list); the list should store the following values: 
 * {"be", "is", "not", "or", "question", "that", "the", "to"}
 *   
 * Because the values will be sorted, all of the duplicates will be grouped together.
 * */
import java.util.*;

public class RemoveDupString {
	
	// This method will only work if the duplicates elements are in order
	// example ["be", "be"] but it won't work for this case ["be", "to" "the", "be"]
	public static ArrayList<String> removeDuplicates(ArrayList<String> arr) {
		for(int i=0; i<arr.size()-1; i++) {
			if(arr.get(i).equals(arr.get(i+1))) {
				arr.remove(i+1);
				i--;
			}
		}
		
		return arr;
	}
	
	// time complexity O(n^2), but this is not the bes approach to do it 
	// because we have to visit every element twice and check
	// space complexity is O(1) 
	public static ArrayList<String> removeDuplicates2(ArrayList<String> words){
		for(int i=0; i<words.size()-1; i++) {
			for(int j=i+1; j<words.size(); j++) {
				if(words.get(i).equals(words.get(j))) {
					words.remove(j);
				}
			}
		}
		
		return words;
	}
	
	public static ArrayList<String> removeDuplicates3(ArrayList<String> ltr){
		ArrayList<String> result = new ArrayList<>();
		HashSet<String> container = new HashSet<>();
		
		for(String i : ltr) {
			if(!container.contains(i)) {
				result.add(i);
				container.add(i);
			}
		}
		
		return result;
	}
	
	// print the arraylist
	public static void printList(ArrayList<String> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.print("\n");
	}

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(
		Arrays.asList("be", "be", "is", "not", "be", "question", "that", "the", "to", "to"));
		//             i
		//                    j
		
		printList(list);
//		ArrayList<String> result = removeDuplicates(list);
//		printList(result);
		
//		ArrayList<String> result2 = removeDuplicates2(list);
//		printList(result2);
		
		ArrayList<String> result3 = removeDuplicates3(list);
		printList(result3);
		

	}

}
