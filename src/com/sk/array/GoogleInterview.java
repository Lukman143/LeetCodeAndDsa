package com.sk.array;

public class GoogleInterview {

	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * int[] nums = { 1,4,4 }; int start = 0; int k=2; int max=-9; int end =
	 * nums.length - 1; System.out.println("End" + end); int mid = (start + end) /
	 * k; int s1 = 0, s2 = 0; int end1=0; int start1=0;
	 * 
	 * for (int i = 0; i < nums.length; i++) { start1 = Math.max(start, nums[i]); //
	 * in the end of the loop this will contain the max item of the array end1 +=
	 * nums[i]; } System.out.println(start1+"---"+end1);
	 * 
	 * for (int i = start; i <= mid; i++) {
	 * 
	 * s1 += nums[i]; if(max<s1) { max=s1; }
	 * 
	 * } mid = mid + 1;
	 * 
	 * for (int i = mid; i <= end; i++) {
	 * 
	 * s2 += nums[i]; if(max<s2) { max=s2; }
	 * 
	 * }
	 * 
	 * System.out.println(s1 + "!!!"+max+"!!!" + s2);
	 * 
	 * 
	 * }
	 * 
	 * public static int splitArray(int[] nums, int k) { return k;
	 * 
	 * }
	 * 
	 * }
	 */
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };

		int k = splitArray(a, 2);
		System.out.println("output : "+k);
	}

	public static int splitArray(int[] nums, int m) {
		
		int start = 0;
		int end = 0;

		for (int i = 0; i < nums.length; i++) {
			start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item of the array
			end += nums[i];
		}
		
		System.out.println("start: "+start+"---end: "+end);
		

		// binary search
		while (start < end) {
			// try for the middle as potential ans
			int mid = (end + start) / 2;
			System.out.println("mid="+mid);
			//int[] a = { 1, 2, 3, 4 };
			// calculate how many pieces you can divide this in with this max sum
			int sum = 0;
			int pieces = 1;
			for (int num : nums) {
				if (sum + num > mid) {
					// you cannot add this in this subarray, make new one
					// say you add this num in new subarray, then sum = num
					sum = num;
					pieces++;
				} else {
					sum += num;
				}
			}

			System.out.println("pieces"+pieces);
			if (pieces > m) {
				start = mid + 1;
			} else {
				end = mid;
			}

		}
		return end; // here start == end
	}

}
