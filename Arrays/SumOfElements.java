package Arrays;

/*
 * Given an array of integers, find the sum of its elements.
 * For example, if the array arr = [1, 2, 3], 1+2+3 , so return 6.
 * */
public class SumOfElements {
	
	public static int simpleArraySum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		
		System.out.print(simpleArraySum(a));
	}

}
