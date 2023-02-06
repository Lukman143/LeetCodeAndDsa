package com.sk.array;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println(binarySearch());

	}

	public static int binarySearch() {

		int[] a = { 1, 2, 3, 4, 5, 6 };

		int tar = 6;

		int start = 0;//

		int end = a.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;//


			if (tar < a[mid]) {
				end = mid-1 ;

			} else if (tar > a[mid]) {
				start = mid+1;
			}

			else
				return mid;

		}
		return -1;

	}

}
