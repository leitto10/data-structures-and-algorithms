package Arrays;

public class BinarySearch {
	
	public static int binarySearch(int[] nums, int value) {
		// base case, check if the array is empty
		if(nums == null) {
			return -1;
		}
		
		int found = -1;
		int left = 0;
		int right = nums.length - 1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			if(value == nums[mid]) {
				found = mid;
				break;
			}else if(value < nums[mid]) {
				right = mid - 1;
			}else if(value > nums[mid]) {
				left = mid + 1;
			}
		}
		
		return found;
	}

	public static void main(String[] args) {
		//                0  1  2  3  4   5   6   7   8   9   10  11  12  13  14
		int[] numbers = {-1, 3, 5, 8, 15, 18, 22, 39, 40, 42, 50, 57, 71, 73, 74};
		
		int arr[] = { 2, 3, 4, 10, 40 };
		
		System.out.print(
		binarySearch(arr, 10));

	}

}
