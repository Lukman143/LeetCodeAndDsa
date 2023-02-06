package com.sk.dsa;

public class PairOfSum {
	public static void main(String[] args) {

		int[] a = { 4, 5, 1, 2, 3, 6 };
		int n = 5;
		int product = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] > product) {
					product = a[i] + a[j];
					System.out.println("PairOfSum.main()" + product);
				}
			}
		}
	}
}
