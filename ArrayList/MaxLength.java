package ArrayList;
/*
 * Write a method maxLength that takes an ArrayList of Strings as a parameter 
 * and that returns the length of the longest string in the list. If your method 
 * is passed an empty list, it should return 0.
 * */
import java.util.*;

public class MaxLength {
	
	public static int maxLength(ArrayList<String> list) {
		
		int max = 0;
		for(int i=0; i<list.size(); i++) {
			String s = list.get(i);
			if(s.length() > max) {
				max = s.length();
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>(
				Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet"));
		//                     i
		
		System.out.print("The length of longest string is : " +
		maxLength(arr));

	}

}
