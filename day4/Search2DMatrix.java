package day4;

import java.util.Scanner;

public class Search2DMatrix {
	
	public static boolean search(int[][] arr, int n, int m, int target) {
		int low = 0;
		int high = n * m - 1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			int row = mid / m;
			int col = mid % m;
			
			if(arr[row][col] == target) {
				return true;
			} else if(arr[row][col] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int target = sc.nextInt();
		System.out.println(search(arr, n, m, target));
		
	}

}
