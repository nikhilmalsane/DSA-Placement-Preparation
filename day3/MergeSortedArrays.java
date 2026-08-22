package day3;

import java.util.Scanner;

public class MergeSortedArrays {
	
	public static void Merge(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int k = m - n - 1;
		int j = n - 1;
		int i = m - 1;
		
		while(k >= 0 && j >= 0) {
			if(nums1[k] >= nums2[j]) {
				nums1[i] = nums1[k];
				k--;
			} else {
				nums1[i] = nums2[j];
				j--;
			}
			i--;
		}
		
		while(j >= 0) {
			nums1[i] = nums2[j];
			j--;
		}
		
		for(int p=0;p<m;p++) {
			System.out.print(nums1[p]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] nums1 = new int[m];
		for(int i=0;i<m;i++) {
			nums1[i] = sc.nextInt();
		}
		
		int n = sc.nextInt();
		int[] nums2 = new int[n];
		for(int i=0;i<n;i++) {
			nums2[i] = sc.nextInt();
		}
		
		Merge(nums1, nums2);
	}

}
