package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeOverlapingIntervals {
	
	public static void mergeIntervals(int[][] intervals) {
		int n = intervals.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(intervals[j][0] > intervals[j+1][0]) {
					int temp[] = intervals[j];
					intervals[j] = intervals[j+1];
					intervals[j+1] = temp;
				}
			}
		}
		
		List<int[]> res = new ArrayList<int[]>();
		int start = intervals[0][0];
		int end = intervals[0][1];
		
		for(int i=1;i<n;i++) {
			if(intervals[i][0] < end) {
				end = Math.max(end, intervals[i][1]);
			} else {
				res.add(new int[] {start, end});
				start = intervals[i][0];
				end = intervals[i][1];
			}
		}
		
		res.add(new int[] {start, end});
		
		for(int[] results : res) {
			System.out.println("["+results[0]+", "+results[1]+"]");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] intervals = new int[n][2];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				intervals[i][j] = sc.nextInt();
			}
		}
		
		mergeIntervals(intervals);
	}

}
