package com.sk.array;

public class Big {
	public static void main(String[] args) {

		int[] a = { 4, 3, 5, 2, 7 };

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int l = 0;
		int s = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {
				l = min;
				min = a[i];

			}

			else if (max < a[i]) {
				s = max;
				max = a[i];
			}

		}
		System.out.println(min + "--" + l);
		System.out.println(max + "--" + s);
	}
}
