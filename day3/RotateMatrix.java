package day3;

import java.util.Scanner;

public class RotateMatrix {
	
	public static void Rotate(int[][] arr) {
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		for(int i=0;i<n;i++) {
			int p = 0;
			int q = n - 1;
			while(p < q) {
				int temp = arr[i][p];
				arr[i][p] = arr[i][q];
				arr[i][q] = temp;
				p++;
				q--;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		Rotate(arr);
	}

}
