package com.sk.array;

import java.util.Arrays;

public class LeetCode34Facebook {

	public static void main(String[] args) {

		/*
		 * int[] nums = {5,7,7,8,8,10 }; int target = 8;
		 */
		int[] nums = {5,7,7,8,8,10};
		int target = 8;

		
		int[] a = searchRange(nums, target);

		System.out.println(Arrays.toString(a));

	}

	public static int[] searchRange(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;


		int[] output = new int[2];

		while (start <= end) {
			int mid = (start + end) / 2;

			if (nums[mid] == target) {
				
				if(nums[mid]==1) {
					output[0] = 0;
					output[1] = 0;
					return output;

				}
				else 
				
				output[0] = mid-1;
				output[1] = mid;
				return output;

			} else if (target < nums[mid]) {

				end = mid - 1;

			} else {

				start = mid +1;

			}

		}

		return new int[] { -1, -1 };

	}

}
