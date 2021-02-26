package Recursion;

/*
 * For each call to the following method, indicate what 
 * console output is produced:
 * */
public class Mystery2 {
	
	public static void mystery2(int n) {
		if(n > 100) {
			System.out.print(n);
		}else {
			mystery2(2 * n);
			System.out.print(", " + n);
		}
	}

	public static void main(String[] args) {
		
		//mystery2(113);
		//mystery2(70);
		//mystery2(42);
		//mystery2(30);
		mystery2(10);
		
	}

}
