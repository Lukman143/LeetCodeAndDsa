package com.sk.array;

public class LeetCode4Array {
	public static void main(String[] args) {
		// Input: nums1 = [1,2], nums2 = [3,4]
		// Output: 2.50000
		// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

		// Input: nums1 = [1,3], nums2 = [2]
		// Output: 2.00000
		// Explanation: merged array = [1,2,3] and median is 2.

		int[] a1 = { 3, 4 };

		int[] a2 = {};

		// double k = (a1[1] + a2[0]) / 2;

		double k = findMedianSortedArrays(a1, a2);

		System.out.println(k);

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double s = 0.0;

		if (nums2.length == 0) {
			if (nums2.length == 0 && nums1.length > 1) {

				for (int i = 0; i < nums1.length; i++) {
					s += nums1[i];
				}
				return s / 2;
			} else {

				return nums1[0];

			}
		}

		if (nums1.length == 0) {

			if (nums1.length == 0 && nums2.length > 1) {
				for (int i = 0; i < nums2.length; i++) {
					s += nums2[i];
				}
				return s / 2;
			} else {

				return nums2[0];

			}
		}

		if (nums2.length != 0) {
			if (nums2[0] == -1) {
				return 0;
			}
		}
		double k1 = 0;
		double k2 = 0;

		if (nums1.length == 0 && nums2.length == 1) {
			return nums2.length;
		}

		else if (nums2.length != 0) {

			for (int i = 0; i < nums1.length; i++) {

				if (nums2.length == 1) {
					return nums2[0];
				}

				k1 = nums1[i];

				if (i == nums1.length - 1) {

					k2 = nums2[0];
				}

			}
		} else if (nums2.length != 0) {
			return 0;
		} else {
			return nums1[0];
		}
		return (k1 + k2) / 2;

	}

}
