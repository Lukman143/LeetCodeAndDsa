package com.sk.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leet34 {

	public static void main(String[] args) {

		int[] a = { 5, 7, 7, 8, 8, 10 };
		int target=8;
		int []k=new Leet34().searchRange(a, target);
		
		
		System.out.println(Arrays.toString(k));
	}

	public int[] searchRange(int[] nums, int target) {

		int[] ans = { -1, -1 };
		// check for first occurrence if target first
		ans[0] = search(nums, target, true);
		if (ans[0] != -1) {
			ans[1] = search(nums, target, false);
		}
		return ans;
	}

	int search(int[] nums, int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (target < nums[mid]) {

				end = mid - 1;

			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				ans = mid;

				if (findStartIndex) {
					return ans-1;
				} else {
					return mid + 1;
				}

			}
		}

		return ans;

	}
}