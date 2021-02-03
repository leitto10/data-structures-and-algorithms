package Arrays;
/*
 * Given an array of integers, find the sum of its elements.
 * For example, if the array ar = [1, 2, 3]; 1+2+3=6 return 6
 * 
 * */
public class SimpleArraySum {
	
	public static int simpleArraySum(int[] nums) {
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			count += nums[i];
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		int[] arr2 = {1, 2, 3, 4, 10, 11};
		
		System.out.print("The sum of all the elements in the array are: " +
		simpleArraySum(arr2));

	}

}
