package Arrays;

public class BubbleSort {
	
	
	
	// time complexity is n^2
	// space complexity is O(1)
	public static int[] bubbleSort(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length-i-1; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		return nums;
	}
	
	//print the array
	public static void printArray(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {2, 7, 1, 3, 5, 4, 6};

		printArray(bubbleSort(arr));
		
	}

}
