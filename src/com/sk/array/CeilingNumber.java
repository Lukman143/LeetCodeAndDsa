package com.sk.array;

public class CeilingNumber {

	public static void main(String[] args) {

		System.out.println(binarySearch());

	}

	public static int binarySearch() {

		int[] a = { 1, 2, 3, 4, 10, 8, 11, 9 };

		int k = 0;

		int tar = 7;

		int start = 0;

		int end = a.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (tar == a[mid]) {
				k = mid;
				return k;
			} else if (tar < a[mid]) {
				end = mid - 1;

			} else if (tar > a[mid]) {
				start = mid + 1;
			}
		}

		if (k == 0) { 

			int m = Integer.MAX_VALUE;

			for (int i = 0; i < a.length; i++) {

				if (tar <= a[i]) {

					k = i;

					for (int j = i; j < a.length; j++) {

						if (m > a[j]) {
							m = a[j];
							k = j;
						}
					}
					return k;
				}
			}
		}
		return k;
	}
}
