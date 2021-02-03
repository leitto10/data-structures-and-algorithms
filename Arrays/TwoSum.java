package Arrays;
/*
 * Given an array of integers nums and an integer target, return indices of 
 * the two numbers such that they add up to target.You may assume that each 
 * input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 * */
import java.util.*;

public class TwoSum {
	
	// time complexity is O(n^2) because we are checking each element twice
	// space complexity is O(1)
	public static int[] twoSumN2(int[] nums, int target) {
		for(int i=0; i<nums.length; i++) {
			for(int j=i + 1; j<nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		
		return new int[] {};
	}
	
	// Time complexity is O(n) We traverse the list containing n elements only once. 
	// Each look up in the table costs only O(1) time.
	// Space complexity : O(n). The extra space required depends on the number of 
	// items stored in the hash table, which stores at most n elements.
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			int temp = target - nums[i];
			if(map.containsKey(temp)) {
				return new int[] {map.get(temp), i};
			}else {
				map.put(nums[i], i);
			}
		}
		
		return new int[] {};
	}

	public static void main(String[] args) {
		// index     0  1  2   3
		int[] arr = {2, 7, 11, 15};
		
		int[] result = twoSum(arr, 9);
		System.out.print("The indexes are: ");
		for(int i: result) {
			System.out.print(result[i] + ", ");
		}
		
		System.out.print("\n");
		
		// index      0  1  2
//		int[] arr2 = {3, 2, 4};
//		
//		int[] result2 = twoSumN2(arr2, 6);
//		System.out.print("The indexes are: ");
//		for(int i=0; i<result2.length; i++) {
//			System.out.print(result2[i] + ", ");
//		}

	}

}
