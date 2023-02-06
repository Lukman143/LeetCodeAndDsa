package com.sk.array;

class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] a = new int[2];

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				int k = nums[i] + nums[j];

				if (k == target) {
					System.out.println(i + "--" + j);
					a[0] = i;
					a[1] = j;

					break;

				}
			}
		}
		return a;

	}

	public static void main(String[] args) {

		int[] input = { 3, 3 };

		int target = 6;

		TwoSum sol = new TwoSum();
		int[] output = sol.twoSum(input, target);
		for (int k = 0; k < output.length; k++) {

			System.out.println(output[k]);
		}

	}
}