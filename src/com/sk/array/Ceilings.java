package com.sk.array;

public class Ceilings {
	public static void main(String[] args) {
		System.out.println(binarySearch());
	}

	public static int binarySearch() {

		int[] a = { 1, 2, 3, 14, -1, 18 };

		int tar = -5;

		int start = 0;//

		int end = a.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (tar == a[mid]) {
				return mid;
			} else if (tar < a[mid]) {
				end = mid - 1;
			} else if (tar > a[mid]) {
				start = mid + 1;
			}

		}

		return start;
	}
}
