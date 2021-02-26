package Recursion;

// For each call to the following method, indicate what console output is produced:
public class mystery1 {
	
	public static void mysTery1(int n) {
		if(n <= 1) {
			System.out.print(n);
		}else {
			mysTery1(n / 2);
			System.out.print(", " + n);
		}
	}

	public static void main(String[] args) {
		
		//mysTery1(1);
		//mysTery1(4);
		//mysTery1(16);
		//mysTery1(30);
		//mysTery1(100);

	}

}
