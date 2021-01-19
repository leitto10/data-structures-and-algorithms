package ArrayList;

public class Solution {
	
	public static int addition() {
		int sum = 0;
		for(int i=2; i<1000; i++) {
			if(i % 3 == 0 || i % 5 == 0 ) {
				sum += i;
			}
		}
		return sum;
	}
	

	public static void main(String[] args) {
		
		System.out.print(addition());
	}

}
