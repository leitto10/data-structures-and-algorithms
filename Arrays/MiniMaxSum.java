package Arrays;
/*
 * Given five positive integers, find the minimum and maximum values that can 
 * be calculated by summing exactly four of the five integers. Then print the 
 * respective minimum and maximum values as a single line of two space-separated
 *  long integers, Example: arr = [1, 3, 5, 7, 9]
 *  The minimum sum is  1 + 3 + 5 + 7 = 16 
 *  The maximum sum is  3 + 5 + 7 + 9 = 24
 *  The function prints 16 24
 *  
 *  Print two space-separated integers on one line: the minimum sum and 
 *  the maximum sum of 4 of 5 elements.
 * */
public class MiniMaxSum {
	
	public static void miniMaxSum(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		long total = 0;
		
		for(int i=0; i<nums.length; i++) {
			total += nums[i];
			if(nums[i] < min) {
				min = nums[i];
			}
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		
		System.out.print("\nThe minimun value is: " + (total - max));
		System.out.print("\nThe maximun value is: " + (total - min));
		System.out.print("\n" + (total- max) + " " + (total - min));
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		int[] arr2 = {1, 3, 5, 7, 9};
		int[] arr3 = {7, 69, 2, 221, 8974};
		
		miniMaxSum(arr);
		
		

	}

}
