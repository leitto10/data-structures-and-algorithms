package Hackerrank;
/*
 * Given an array of integers, find the sum of its elements. For example, 
 * if the array arr = {1, 2, 3}; 1 + 2 + 3 = 6, return 6.
 * 
 * */
public class SimpleArraySum {
	
	public static int simpleArraySum(int[] nums) {
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			count = count + nums[i];
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		
		System.out.print(
		simpleArraySum(arr));

	}

}
