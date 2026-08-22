package day4;

import java.util.Scanner;

public class MajorityElement {
	
	public static int major(int[] arr) {
		int n = arr.length;
		int count = 0;
		int var = 0;
		
		for(int i=0;i<n;i++) {
			if(count == 0) {
				count++;
				var = arr[i];
			} else if(arr[i] == var) {
				count++;
			} else {
				count--;
			}
		}
		
		return var;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(major(arr));
	}

}
