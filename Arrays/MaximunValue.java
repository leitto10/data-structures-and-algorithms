package Arrays;
/*
 * Write a method called max that accepts an array of integers as a 
 * parameter and returns the maximum value in the array. For example, 
 * if the array passed stores {12, 7, -1, 25, 3, 9}, your method should 
 * return 25. You may assume that the array contains at least one element.
 * Your method should not modify the elements of the array
 * */

public class MaximunValue {
	
	public static int max(int[] nums) {
		int maxValue = nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i] > maxValue) {
				maxValue = nums[i];
			}
		}
		
		return maxValue;
	}

	public static void main(String[] args) {
		
		int[] arr = {12, 7, -1, 25, 3, 9};

		System.out.print("The max value in the array is: " + max(arr));
	}

}
