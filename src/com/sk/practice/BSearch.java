package com.sk.practice;

public class BSearch {

	public static void main(String[] args) {

		System.out.println(binarySearch());

	}

	public static int binarySearch() {

		int[] a = { 1, 2, 3, 4, 5, 7, 8 };

		int start = 0;
		int end = a.length - 1;

		int tar = 6;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (tar < a[mid]) {
				end = mid - 1;
			} else if (tar > a[mid]) {
				start = mid + 1;
			} else
				return mid;

		}

		return start;

	}
}
