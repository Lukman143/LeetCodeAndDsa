package com.sk.dsa;

public class FirstAndSecondBigNoInArray {
	public static void main(String[] args) {

		int[] a = { 1000, 1, 10, 2, 7, 6, 8, 5, 1, 1, 19, 2, 3, 6 };

		int fm = 0, sm = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > fm) {

				sm = fm;

				fm = a[i];

			} else if (sm < a[i]) {
				sm = a[i];
			}
		}
		System.out.println(fm + "------" + sm);
	}
}
