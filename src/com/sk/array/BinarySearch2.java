package com.sk.array;

public class BinarySearch2 {

	public static void main(String[] args) {

		System.out.println(BinarySearch2() + "*******");

	}

	public static int BinarySearch2() {

		int[] a = { 1, 2, 3, 4 };

		int start = 0;//

		int tar = 3;
		int end = a.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (tar < a[mid]) {

				end = mid - 1;

			} else if (tar > a[mid]) {

				start = mid + 1;
			} else
				return mid;

		}

		return -1;

	}

}
