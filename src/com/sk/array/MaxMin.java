package com.sk.array;

public class MaxMin {
	public static void main(String[] args) {

		max();
		min();
		/*
		 * maxTdi(); minTdi();
		 */

	}

	public static void maxTdi() {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int min = Integer.MIN_VALUE;

		System.out.println("length" + a.length);

		for (int r = 0; r < a.length; r++) {

			for (int c = 0; c < a[r].length; c++) {

				if (a[r][c] > min) {
					min = a[r][c];
				}
			}
		}
		System.out.println(min);
	}

	public static void minTdi() {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int max = Integer.MAX_VALUE;

		System.out.println("length" + a.length);

		for (int r = 0; r < a.length; r++) {

			for (int c = 0; c < a[r].length; c++) {

				if (a[r][c] < max) {
					max = a[r][c];
				}
			}
		}
		System.out.println(max);
	}

	public static void max() {

		int[] a = { 4, 3, 100, 5, 6, 9, 11 };

		int min = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > min) {
				min = a[i];
			}

		}
		System.out.println(min);

	}

	public static void min() {
		int[] a = { 4, 3, 100, 5, 6, 9, 11 };

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println(min);

	}
}
