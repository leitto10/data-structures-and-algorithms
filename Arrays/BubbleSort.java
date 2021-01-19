package Arrays;

public class BubbleSort {
	
	//print the array
	public static void printArray(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {2, 7, 1, 3, 5, 4, 6};

		printArray(arr);
	}

}
