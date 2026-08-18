package day1;

import java.util.Scanner;

public class PascalTraingle {
	
	public static int[] createRow(int r) {
		int[] row = new int[r];
		int col = 1;
		int curr = 1;
		
		for(int i=0;i<r;i++) {
			row[i] = curr;
			curr = curr * (r - col) / col;
			col++;
		}
		
		return row;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[] row = createRow(r);
		System.out.println(row[c - 1]);
	}

}
