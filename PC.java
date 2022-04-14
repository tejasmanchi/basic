package Tathastu;

import java.util.Scanner;

public class PC {
	
	static long factorial(int num) {
		int f = 1;
		
		for (int i = 1; i <= num; i++) {
			f *= i;
		}
	    
		return f;
	    }
	    
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.print("Enter the value of n: ");
	    int n = sc.nextInt();
	    
	    System.out.print("Enter the value of r: ");
	    int r = sc.nextInt();
	    
	    int p = (int)(factorial(n) / factorial(n - r));
	    int c = (int)(factorial(n) / (factorial(n - r) * factorial(r)));
	    System.out.println("Permutation = " + p);
	    System.out.println("Combination = " + c);
	    }
}

