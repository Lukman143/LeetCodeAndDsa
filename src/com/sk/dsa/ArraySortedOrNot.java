package com.sk.dsa;

public class ArraySortedOrNot {

	public static int sorted(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] > a[i + 1]) {
				return 0;
			}

		}
		return 1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 7, 2, 3, 4, 5, 6 };
		System.out.println(sorted(a));
	}

}
