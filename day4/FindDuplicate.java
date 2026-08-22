package day4;

import java.util.Scanner;

public class FindDuplicate {
	
	public static int Duplicate(int[] arr) {
		int n = arr.length;
		int[] counts = new int[n+1];
		
		for(int i=0;i<n;i++) {
			if(counts[arr[i]] == 0) {
				counts[arr[i]]++;
			} else {
				return arr[i];
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Duplicate(arr));
	}

}
