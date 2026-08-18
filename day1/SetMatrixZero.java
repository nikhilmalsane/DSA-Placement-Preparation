package day1;

import java.util.HashSet;
import java.util.Scanner;

public class SetMatrixZero {
	
	public static void SetZero(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		
		HashSet<Integer> rows = new HashSet<>();
		HashSet<Integer> cols = new HashSet<>();
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j] == 0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}
		
		for(int i=0;i<m;i++) {
			if(rows.contains(i)) {
				for(int j=0;j<n;j++) {
					arr[i][j] = 0;
				}
			}
		}
		
		for(int j=0;j<n;j++) {
			if(cols.contains(j)) {
				for(int i=0;i<m;i++) {
					arr[i][j] = 0;
				}
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		SetZero(arr);
	}

}
