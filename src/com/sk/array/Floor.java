package com.sk.array;

public class Floor {
	public static void main(String[] args) {
		System.out.println(binarySearch());
	}

	public static int binarySearch() {

		int[] a = { 1, 2, 3, 14, 100, 18 };

		int tar = 13;

		int start = 0;//

		int end = a.length - 1;
		int k = 0;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (tar == a[mid]) {
				k = mid;
				return mid;

			} else if (tar < a[mid]) {
				end = mid - 1;
			} else if (tar > a[mid]) {
				start = mid + 1;

			}

		}
		if (k == 0) {

			int m = Integer.MIN_VALUE;

			for (int i = 0; i < a.length; i++) {

				if (tar <= a[i]) {

					k = i;

					for (int j = i; j < a.length; j++) {

						if (m < a[j]) {
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
