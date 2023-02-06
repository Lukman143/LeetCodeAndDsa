package com.sk.array;

public class MountainArray {
	public static void main(String[] args) {

		int[] a = { -2147483648, -2147483647 };

		int max = -9;
		int output = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] < 0) {
				System.out.println(a[i]);
				if (max > a[i]) {
					max = a[i];
				}
			}

			if (max < a[i]) {
				max = a[i];
				output = i;
			}

		}
		System.out.println(output);

	}
}
