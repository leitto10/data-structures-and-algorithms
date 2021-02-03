package Arrays;
/*
 * initialize the value for j as i+1, this sorting algorithm is called bubble sort, 
 * that works by repeatedly swapping the adjacent elements if they are in wrong order. 
 * The below method is always runs O(n^2) time even if the array is sorted.
 * */
public class SortArray {
	
	public static int[] sortTheArray(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		return nums;
	}
	
	public static void printArray(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		
		int[] arr2 = {13, 7, 6, 45, 21, 9, 101, 102};
		printArray(arr2);
		int[] result = sortTheArray(arr2);
		printArray(result);
		

	}

}
