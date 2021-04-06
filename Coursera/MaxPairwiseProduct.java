package Coursera;
import java.util.*;
import java.io.*;
/*
 * Maximum Pairwise Product Problem, Find the maximum product of two distinct num- bers 
 * in a sequence of non-negative integers. In this programming challenge, your goal is to
 * implement a program that works in less than one second even on huge datasets.
 * 
 * Example:  
 * Input : 3
 * 1 2 3
 * Output: 6
 * 
 * Sample 2.
 * Input: 10
 * 7 5 14 2 8 8 10 1 2 3
 * Output: 140
 * 
 * 
 * */
public class MaxPairwiseProduct {
	
	static long getMaxPairwiseProduct(int[] numbers) {
		int result = 0;
		
		int firstMax, secondMax;
		
		if(numbers[0] > numbers[1]) {
			firstMax = numbers[0];
			secondMax = numbers[1];
		}else {
			firstMax = numbers[1];
			secondMax = numbers[0];
		}
		
		for (int i = 2; i < numbers.length; ++i) {
            if(numbers[i] > firstMax){
                secondMax = firstMax;
                firstMax = numbers[i];
            }else if(numbers[i] > secondMax){
                secondMax = numbers[i];
            }
        }
		
		/*
        In Java, all math is done in the largest data type required to handle all of the current values. 
        So, if you have int * int, it will always do the math as an integer, but int * long is done as a long. 
		 */
		return (long)firstMax * secondMax;
		
	}

	public static void main(String[] args) {
		FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));

	}
	
	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
