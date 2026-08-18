package day1;

import java.util.Scanner;

public class NextPermutation {
	
	public static void Permutation(int[] arr) {
		int n = arr.length;
		int b = -1;
		
		for(int i=n-2;i>=0;i--) {
			if(arr[i] < arr[i+1]) {
				b = i;
				break;
			}
		}
		
		if(b != -1) {
			for(int j=n-1;j>=0;j--) {
				if(arr[j] > arr[b]) {
					int temp = arr[j];
					arr[j] = arr[b];
					arr[b] = temp;
					break;
				}
			}
			
			int left = b + 1;
			int right = n - 1;
			while(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		} else {
			int left = 0;
			int right = n - 1;
			while(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
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
		
		Permutation(arr);
	}

}
