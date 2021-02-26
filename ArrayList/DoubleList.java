package ArrayList;
/*
 * Write a method doubleList that takes an ArrayList of Strings as a parameter and that 
 * replaces every string with two of that string. For example, if the list stores the 
 * values {"how", "are", "you?"} before the method is called, it should store the values 
 * {"how", "how", "are", "are", "you?", "you?"} after the method finishes executing.
 * */
import java.util.*;

public class DoubleList {
	
	public static ArrayList<String> doubleList(ArrayList<String> words){
		// check if array list is empty
		if(words == null) {
			return null;
		}
		
		for(int i=0; i<words.size(); i+=2) {
			String c = words.get(i);
			words.add(i + 1, c);
		}
		
		return words;
	}
	
	public static void printList(ArrayList<String> a) {
		for(int i=0; i<a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		// empty list
		ArrayList<String> empty = new ArrayList<String>(
				Arrays.asList());
		
		ArrayList<String> list = new ArrayList<String>(
				Arrays.asList("how", "are", "you?"));
		
		doubleList(list);
		printList(list);
		

	}

}
