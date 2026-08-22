package day4;

import java.util.Scanner;

public class CalculatePower {
	
	public static double power(double x, int n) {
		if(n == 0) {
			return 1.0;
		}
		
		if(n == 1) {
			return x;
		}
		
		if(n % 2 == 0) {
			return power(x * x, n / 2);
		} else {
			return x * power(x, n - 1);
		}
	}
	
	public static double handleNegative(double x, int n) {
		if(n < 0) {
			return 1.0 / power(x, -n);
		}
		
		return power(x, n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int n = sc.nextInt();
		
		System.out.println(handleNegative(x, n));
	}

}
