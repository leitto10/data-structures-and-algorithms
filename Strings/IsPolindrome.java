package Strings;

/*
 * Given a string str, the task is to find whether the string is a 
 * palindrome or not.
 * */
public class IsPolindrome {
	
	public static boolean isPolindrome(String words) {
		int star = 0;
		int end = words.length()-1;
		
		while(star < end) {
			if(words.charAt(star) != words.charAt(end)) {
				return false;
			}
			star++;
			end--;
		}
		
		return true;
	}

	public static void main(String[] args) {
		//          star  end
		//            |   |
		String str = "josoj";
		String str2 = "A man, a plan, a canal: Panama";

//		System.out.print(
//		isPolindrome(str));
		
		System.out.print("\n");
		
		System.out.print(
				isPolindrome(str));
	}

}
