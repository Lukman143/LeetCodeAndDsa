package com.sk.array;

import java.util.Arrays;

public class LeetCode34Facebook1 {
	/*
	 * public static void main(String[] args) {
	 * 
	 * int[] nums = {1,2,3 }; int target = 2;
	 * 
	 * int[] a = searchRange(nums, target);
	 * 
	 * System.out.println(Arrays.toString(a));
	 * 
	 * }
	 * 
	 * public static int[] searchRange(int[] nums, int target) {
	 * 
	 * int[] output = new int[2];
	 * 
	 * for (int i = 0; i < nums.length; i++) {
	 * 
	 * if (nums[i] == 1 && target==1) { if (target == 0) { break; }
	 * 
	 * output[0] = 0; output[1] = 0; return output; } else if(nums[i] == target) {
	 * 
	 * output[0] = i;
	 * 
	 * if (nums.length <= i + 1) { output[1] = i; } else output[1] = i + 1; return
	 * output;
	 * 
	 * } }
	 * 
	 * return new int[] { -1, -1 }; }
	 */
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		int target = 2;

		int[] a = searchRange(nums, target);

		System.out.println(Arrays.toString(a));

	}

	public static int[] searchRange(int[] nums, int target) {
		
		/*
		 * int[] nums = { 1, 2, 3 }; int target = 2;
		 */

		int[] ans = { -1, -1 };
		// check for first occurrence if target first
		ans[0] = search(nums, target, true);
		if (ans[0] != -1) {
			ans[1] = search(nums, target, false);
		}
		return ans;
	}

	// this function just returns the index value of target
	static int search(int[] nums, int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			// find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
			int mid = start + (end - start) / 2;

			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				// potential ans found
				ans = mid;
				if (findStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}
}
