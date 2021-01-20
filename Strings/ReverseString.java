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
		
		int left = 0;
		int right = letters.length-1;
		
		while(left < right) {
			char temp = letters[left];
			letters[left] = letters[right];
			letters[right] = temp;
			left++;
			right--;
		}
		
		return new String(letters);
	}

	public static void main(String[] args) {
		
		String mystring = "I love tacos";
		
		//System.out.print(reverse(mystring));
		System.out.print(reverse2(mystring));

	}

}
