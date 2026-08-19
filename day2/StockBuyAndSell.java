package day2;

import java.util.Scanner;

public class StockBuyAndSell {
	
	public static int MaxProfit(int[] arr) {
		int n = arr.length;
		int min = Integer.MAX_VALUE;
		int max = 0;
		
		for(int i=0;i<n;i++) {
			if(arr[i] < min) {
				min = arr[i];
			} else {
				int profit = arr[i] - min;
				if(profit > max) {
					max = profit;
				}
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
		
		System.out.println(MaxProfit(arr));
	}

}
