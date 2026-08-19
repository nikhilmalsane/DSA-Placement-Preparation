package day2;

import java.util.Scanner;

public class KadanesAlgorithm {
	
	public static int MaxSum(int[] arr) {
		int n = arr.length;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			sum += arr[i];
			
			if(sum > max) {
				max = sum;
			}
			
			if(sum < 0) {
				sum = 0;
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(MaxSum(arr));
	}

}
