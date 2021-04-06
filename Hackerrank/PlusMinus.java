package Hackerrank;
/*
 * Given an array of integers, calculate the ratios of its elements that 
 * are positive, negative, and zero. Print the decimal value of each 
 * fraction on a new line with 6 places after the decimal.
 * 
 * Note: This challenge introduces precision problems. The test cases 
 * are scaled to six decimal places, though answers with absolute error 
 * of up to 10^-4 are acceptable.
 * 
 * Example
 * arr = [1, 1, 0, -1, -1]
 * There are n = 5 elements, two positive, two negative and one zero.
 * Their ratios are 2/5 = 0.400000, 2/5 = 0.400000, 1/5 = 0.200000
 * Results printed are:
 * 
 * 0.400000
 * 0.400000
 * 0.200000
 * */
public class PlusMinus {
	
	public static void ratios(int[] nums) {
		double positives = 0;
		double negatives = 0;
		double zeros = 0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] > 0) {
				positives++;
			}else if(nums[i] < 0) {
				negatives++;
			}else {
				zeros++;
			}
		}
		
		System.out.printf("%1.6f " , positives/nums.length);
		System.out.printf("%1.6f " , negatives/nums.length);
		System.out.printf("%1.6f " , zeros/nums.length);
		
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 1, 0, -1, -1};
		
		ratios(arr);

	}

}
