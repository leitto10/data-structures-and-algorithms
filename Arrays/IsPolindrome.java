package Arrays;
/* Write a method isPalindrome that accepts an array of Strings as its argument and 
 * returns true if that array is a palindrome (if it reads the same forwards as 
 * backwards) and /false if not. For example, the array 
 * {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"} is a palindrome, 
 * so passing that array to your method would return true. Arrays with zero or one 
 * element are considered to be palindromes.
 * */

public class IsPolindrome {
	
	public static boolean isPalindrome(String[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while(start < end) {
			if(!arr[start].equals(arr[end])) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}
	
	// Given a string, determine if it is a palindrome, considering only alphanumeric 
	// characters and ignoring cases. For example, "A man, a plan, a canal: Panama" is 
	// a palindrome. "race a car" is not a palindrome.
	// There are several different ways to solve this problem. The following is a 
	// solution with O(n) time complexity and O(1) space complexity
	public static boolean stringPalindrome(String s) {
		if(s==null) return false;
	 
	    s = s.toLowerCase();
	    
	    int i = 0;
	    int j = s.length()-1;
	    while(i < j){
	        while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z') 
	                    || (s.charAt(i)>='0'&&s.charAt(i)<='9'))){
	            i++;
	        }
	        while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z') 
	                    || (s.charAt(j)>='0'&&s.charAt(j)<='9'))){
	            j--;
	        }
	        if(s.charAt(i) != s.charAt(j)){
	            return false;
	        }
	 
	        i++;
	        j--;
	    }
	 
	    return true;
	}

	public static void main(String[] args) {
		//                     0        1        2        3        4       5        6
		String[] myString = {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"};
		//String[] oneString = {"Jose"};
		//String[] empty = {};
		System.out.print(isPalindrome(myString) + " the array is polindrome.");
		System.out.print("\n");
		
		String str1 = "A man, a plan, a canal: Panama";
		String str2 = "race a car";
		System.out.print(stringPalindrome(str2));
	}

}
