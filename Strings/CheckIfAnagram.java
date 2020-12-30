package Strings;


public class CheckIfAnagram {
	// check if two strings are anagrams
	
	public static boolean isAnagram(String str1, String str2) {
		// check if the length are not equal, therefore they are not anagram
		if(str1.length() != str2.length()) {
			return false;
		}
		// let's convert all to lower case to make our lives a little easier 
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		// if the length are equals
		int[] letters = new int[256];
		
		//increment the counts for each character in the first string, 
		//and decrement the count for each character in the second. 
		//If the two strings are anagrams, then the result will be that 
		//everything balances to 0.
		for(int i=0; i< str1.length(); i++) {
			letters[str1.charAt(i)]++;
			letters[str2.charAt(i)]--;
		}
		
		for(int i: letters) {
			if(i != 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		//time complexity of O(n). However, it needs extra space for the counting array. 
		//At 256 integers, for ASCII that's not too bad.
		
		String s1 = "JOSELopez";
		String s2 = "lopezjoSe";
		
		System.out.print(isAnagram(s1, s2));

	}

}
