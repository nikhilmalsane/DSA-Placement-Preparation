package day2;

import java.util.Scanner;

public class SortArray {
	
	public static void sortArray(int[] arr) {
		int n = arr.length;
		int zero = 0;
		int one = 0;
		int two = 0;
		
		for(int i=0;i<n;i++) {
			if(arr[i] == 0) {
				zero++;
			} else if(arr[i] == 1) {
				one++;
			} else {
				two++;
			}
		}
		
		for(int i=0;i<n;i++) {
			if(zero > 0) {
				arr[i] = 0;
				zero--;
			} else if(one > 0) {
				arr[i] = 1;
				one--;
			} else {
				arr[i] = 2;
				two--;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		sortArray(arr);
	}

}
