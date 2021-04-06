package Strings;

/* Given a string s, find the length of the longest substring without repeating characters
 * 
 * Example 1
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * 
 * Example 2
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 * Example 3
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * Example 4
 * Input: s = ""
 * Output: 0
 * */
import java.util.*;

public class LongestSubString {
	
	public static int longestSubString(String s) {
		if(s == null || s.length() == 0) return 0;
		
		int i=0, j=0, max=0;
		Set<Character> container = new HashSet<>();
		while(i < s.length()) {
			char c = s.charAt(i);
			while(container.contains(c)) {
				container.remove(s.charAt(j));
				j++;
			}
			container.add(c);
			max = Math.max(max, i-j+1);
			i++;
		}
		
//		for(char c: container) {
//			System.out.print(c + " ");
//		}
		
		return max;
	}
	
	// leetcode example
	public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0, i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        
        while(i < n && j < n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }else {
                set.remove(s.charAt(i++));
            }
        }
        
        return ans;
        
    }

	public static void main(String[] args) {
		
		String mystring = "abbaca";
		
		System.out.print(  
				longestSubString(mystring));
		

	}

}
