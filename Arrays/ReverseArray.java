package Arrays;
/*
 * Reverse an array of integers
 * */
public class ReverseArray {
	
	public static int[] reverse(int[] nums) {
		int left = 0;
		int right = nums.length-1;
		
		while(left < right) {
			// swap the values at the left and right indices
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			// move the left and right index pointers in toward the center
			left++;
			right--;
			
		}
		
		return nums;
	}
	
	// 
	public static void reverse2(int[] nums) {
		for(int i=0; i<nums.length / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[nums.length-i-1];
			nums[nums.length-i-1] = temp;
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
//		int[] result = reverse(arr);
//		printArray(result);
		
		reverse2(arr);
		System.out.print("Reversing the array: ");
		printArray(arr);
		
		

	}

}
