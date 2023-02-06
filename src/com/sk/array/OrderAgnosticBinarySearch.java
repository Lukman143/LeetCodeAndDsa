package com.sk.array;

public class OrderAgnosticBinarySearch {
	public static void main(String[] args) {
		System.out.println(binarySearch());

	}

	public static int binarySearch() {

		int[] a = { 4, 5, 6, 1, 2, 3 };

		int tar = 5;

		int start = 0;//

		int end = a.length - 1;

		boolean isAsc = a[start] < a[end];

		while (start <= end) {

			int mid = (start + end) / 2;

			if (a[mid] == tar) {
				return mid;

			}

			if (isAsc) {
				if (tar < a[mid]) {
					end = mid - 1;

				} else {
					start = mid + 1;
				}
			} else {
				if (tar > a[mid]) {
					end = mid - 1;

				} else {
					start = mid + 1;
				}
			}

		}
		return -1;
	}
}
