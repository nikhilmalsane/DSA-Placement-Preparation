package day4;

import java.util.Scanner;

public class FindRepeatingAndMissing {
	
	public static int[] RepeatAndMiss(int[] arr) {
		int n = arr.length;
		int[] counts = new int[n+1];
		int[] res = new int[2];
		
		for(int i=0;i<n;i++) {
			counts[arr[i]]++;
		}
		
		for(int i=1;i<n+1;i++) {
			if(counts[i] == 0) {
				res[1] = i;
			} else if(counts[i] == 2) {
				res[0] = i;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] res = RepeatAndMiss(arr);
		for(int i=0;i<2;i++) {
			System.out.print(res[i]+"  ");
		}
	}

}
