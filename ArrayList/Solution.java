package ArrayList;
/*
 * PROBLEM STATEMENT
 * If we list all the natural numbers between 1 and 10 (not including 1 or 10) 
 * that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these 
 * multiples is 23. Write code using a language of your choice that will 
 * find the sum of all the multiples of 3 or 5 between 1 and 1000 
 * (not including 1 or 1000) and display the result.
 * HINTS
 * Start small. Write code that solves this problem for all numbers below 10 
 * first and verify the result is 23. After that, try solving it for 100, then 
 * 1000. An incremental approach will make sure you can think your way through.
 * */

public class Solution {
	
	public static int addition() {
		int sum = 0;
		for(int i=2; i<1000; i++) {
			if(i % 3 == 0 || i % 5 == 0 ) {
				sum += i;
			}
		}
		return sum;
	}
	

	public static void main(String[] args) {
		
		System.out.print(addition());
	}

}
