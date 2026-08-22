package day4;

import java.util.Scanner;

public class CountInversions {
	
	public static int merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		
		int i = low;
		int j = mid + 1;
		int k = 0;
		
		int count = 0;
		
		while(i <= mid && j <= high) {
			if(arr[i] <= arr[j]) {
				temp[k] = arr[i];
				i++;
			} else {
				temp[k] = arr[j];
				count += (mid - i + 1);
				j++;
			}
			
			k++;
		}
		
		while(i <= mid) {
			temp[k] = arr[i];
			i++;
			k++;
		}
		
		while(j <= high) {
			temp[k] = arr[j];
			j++;
			k++;
		}
		
		for(int p=0;p<temp.length;p++) {
			arr[low + p] = temp[p];
		}
		
		return count;
	}
	
	public static int mergeSort(int[] arr, int low, int high) {
		int count = 0;
		
		if(low >= high) {
			return count;
		}
		
		int mid = low + (high - low) / 2;
		
		count += mergeSort(arr, low, mid);
		count += mergeSort(arr, mid + 1, high);
		count += merge(arr, low, mid, high);
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(mergeSort(arr, 0, n - 1));
	
	}

}
