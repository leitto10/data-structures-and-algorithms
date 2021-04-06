package Hackerrank;
/*
 * Given five positive integers, find the minimum and maximum values 
 * that can be calculated by summing exactly four of the five integers. 
 * Then print the respective minimum and maximum values as a single line 
 * of two space-separated long integers.
 * 
 * Example arr = [1, 3, 5, 7, 9]
 * The minimum sum is 1 + 3 + 5 + 7 = 16
 * The maximun sum is 3 + 5 + 7 + 9 = 24
 * 
 * output = 16 24
 * */
public class MiniMaxSum {
	
	public static void miniMaxSum(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		int count = 0;
		
		for(int i=0; i<nums.length; i++) {
			count = count + nums[i];
			
			if(nums[i] < min) {
				min = nums[i];
			}else if(nums[i] > max){
				max = nums[i];
			}
		}
		
		System.out.print("Maximun value is: " + (count - min) + " " + 
		"\nMinimum value is: " + (count - max));
		
	}
	
	public static void main(String[] args) {
		//           i
		int[] arr = {1, 3, 5, 7, 9};
		
		miniMaxSum(arr);
		
	}
	

}
