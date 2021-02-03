package Strings;

/*
 * Reverse words in a given string
 * Given an input string s, reverse the order of the words. 
 * A word is defined as a sequence of non-space characters. 
 * The words in s will be separated by at least one space.
 * */

public class ReverseWords {
	
	// Time Complexity O(n) where n is the number of characters in the given string.
	// Space Complexity O(n) because we used space to store n elements.
	public static String reverseWords(String s) {
		int i = s.length() - 1;
        int begin; 
        int end = i + 1;

        String res = ""; 
          
        while(i >= 0){
            if(s.charAt(i) == ' '){ 
                begin = i + 1; 
                while(begin != end) 
                    res += s.charAt(begin++); 
                  
                res += ' '; 
                  
                end = i; 
            } 
            i--; 
        } 
          
        begin = 0; 
        while(begin != end) 
            res += s.charAt(begin++); 
          
        return res;
	}
	

	public static void main(String[] args) {
		
		String my = "Jose Lopez";

		System.out.print(
		reverseWords(my));
	}

}
