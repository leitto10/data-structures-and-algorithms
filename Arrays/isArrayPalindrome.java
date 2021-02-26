package Arrays;
/*
 * Write a method isPalindrome that accepts an array of Strings as its argument and 
 * returns true if that array is a palindrome (if it reads the same forwards as 
 * backwards) and /false if not. For example, the array 
 * {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"} is a palindrome, 
 * so passing that array to your method would return true. Arrays with zero or one 
 * element are considered to be palindromes.
 * */
public class isArrayPalindrome {
	
	public static boolean isPolindrome(String[] arr) {
		int star = 0;
		int end = arr.length-1;
		
		while(star < end) {
			if(arr[star] != arr[end]) {
				return false;
			}
			
			star++;
			end--;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		//               star                                                 end
		//                 |                                                   |
		String[] arr = {"alpha.", "beta", "gamma", "delta", "gamma", "beta", "alpha."};

		System.out.print(
		isPolindrome(arr));
	}

}
