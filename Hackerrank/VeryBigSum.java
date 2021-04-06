package Hackerrank;
/*
 * In this challenge, you are required to calculate and print the sum of the elements 
 * in an array, keeping in mind that some of those integers may be quite large.
 * Function Description
 * Complete the aVeryBigSum function in the editor below. It must return the sum of all
 * array elements. aVeryBigSum has the following parameter(s): int ar[n]: an array of integers
 * Return long: the sum of all array elements 
 * */
public class VeryBigSum {
	
	public static long aVeryBigSum(long[] nums) {
		long count = 0;
		
		for(int i=0; i<nums.length; i++) {
			count = count + nums[i];
		}
		
		return count;
	}

	public static void main(String[] args) {
		//               i
		long[] arr = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
		
		System.out.print("The very big sum is: " + 
				aVeryBigSum(arr));

	}

}
