package Strings;

public class ReverseString {
	
	public static String reverse(String s) {
		char[] letters = new char[s.length()];
		
		int j = 0;
		for(int i = s.length()-1; i >=0; i--) {
			letters[j] = s.charAt(i);
			j++;
		}
		
		String reverseword = "";
		for(int i=0; i<s.length(); i++) {
			reverseword = reverseword + letters[i];
		}
		
		return reverseword;
	}
	
	public static String reverse2(String s) {
		char[] letters = s.toCharArray();
		
		int i = 0;
		int j = letters.length-1;
		
		while(i < j) {
			char temp = letters[i];
			letters[i] = letters[j];
			letters[j] = temp;
			i++;
			j--;
		}
		
		return new String(letters);
	}

	public static void main(String[] args) {
		
		String mystring = "I love tacos";
		//                 s love tacoI
		//                  ^        ^
		//                  |        |
		//                  i        j
		
		//System.out.print(reverse(mystring));
		System.out.print(reverse2(mystring));

	}

}
