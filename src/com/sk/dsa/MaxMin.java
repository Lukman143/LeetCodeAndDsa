package com.sk.dsa;

public class MaxMin {
	public static void main(String[] args) {

		int[] a = { 8, 6, 7, 2, 9, 3, 4, 5 };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				System.out.println(min + "!!!!!!!!!" + a[i]);
				min = a[i];
			}
		}
		System.out.println(max + "---" + min);
	}
}
