package com.sk.array;

public class LinearSearch {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 7, 4, 5 };
		int target = 7;

		// linearSearchWithInt(a, target);

		String s = "lukman";
		char c = 'k';

		//linearSearchWithString(s, c);

		int[] a1 = { 9, 1, 2, 3, 7, 4, 5, 8 };
		int target1 = 10;
		int start = 2;
		int end = 4;

		//linearSearchInRange(a1, target1, start, end);

		int m[] = { 2, 5, 9, 6, 3, 7, 8 };

		int max = Integer.MAX_VALUE;
		maxNumber(m, max);

		int m1[] = { 2, 5, 9, 6, 3, 7, 8 };

		// minNumber(m1);
		minNumber();

	}

	public static void linearSearchWithInt(int[] a, int target) {

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == target) {
				System.out.println(target + " is available at index = " + i);
			}
		}
	}

	public static void linearSearchWithString(String s, char target) {

		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] == target) {
				System.out.println(target + " is available at index = " + i);
			}
		}
	}

	public static void linearSearchInRange(int[] a1, int target, int start, int end) {

		for (int i = start; i < end; i++) {
			System.out.println(i + "---");
			if (a1[i] == target) {
				System.out.println(target + " is available at index = " + i);
			}

		}
	}

	public static void maxNumber(int[] a, int max) {

		int k = 0;

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] < max) {
				k = a[i];
			}
		}
		System.out.println("Maximum number is " + k);
	}

	public static void minNumber() {

		int l = 0;
		int min = Integer.MIN_VALUE;
		int m1[] = { 5,2, 9, 6, 3, 7, 8 };

		for (int i = 0; i < m1.length - 1; i++) {

			if (m1[i] < min) {
				System.out.println("Minimum number is " + m1[i]);

				min = m1[i];
				l = m1[i];

			}
		}
		System.out.println("Minimum number is===========" + l);
	}
}
